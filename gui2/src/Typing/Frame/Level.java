
package Typing.Frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Typing.Controller.ActionListener.CtrlDifficult;
import Typing.Controller.ActionListener.CtrlEasy;
import Typing.Controller.ActionListener.CtrlMode;
import Typing.Controller.ActionListener.CtrlNormal;

public class Level {
	private Image backgroundImage;

	public Level() {
		// 背景画像の読み込み
		try {
			File bgFile = new File("7.png");
			if (bgFile.exists()) {
				backgroundImage = ImageIO.read(bgFile);
			}
		} catch (IOException e) {
			System.err.println("P4: 背景画像の読み込みに失敗しました。");
		}
	}

	public JPanel DifficultyPanel(CardLayout layout, JPanel panel) {
		// メインパネル（背景描画付き）
		JPanel mainPanel = new JPanel(new BorderLayout()) {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				if (backgroundImage != null) {
					g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
				} else {
					g.setColor(new Color(13, 94, 117));
					g.fillRect(0, 0, getWidth(), getHeight());
				}
			}
		};

		// 1. タイトル部分
		JLabel titleLabel = new JLabel("　", SwingConstants.CENTER);
		titleLabel.setFont(new Font("MS Gothic", Font.BOLD, 48));
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setBorder(BorderFactory.createEmptyBorder(60, 0, 20, 0));
		mainPanel.add(titleLabel, BorderLayout.NORTH);

		// 2. ボタンを配置する中央パネル
		JPanel buttonContainer = new JPanel(new GridLayout(3, 1, 0, 30));
		buttonContainer.setOpaque(false);
		buttonContainer.setBorder(BorderFactory.createEmptyBorder(20, 300, 100, 300));

		// 各難易度ボタン（ハリボテなのでアクションは未実装）
		buttonContainer.add(createLuxuryButton("かんたん", new Color(245, 225, 210), new Color(40, 40, 40),
				new CtrlEasy(layout, panel)));
		buttonContainer.add(createLuxuryButton("ふつう", new Color(144, 238, 144), new Color(40, 40, 40),
				new CtrlNormal(layout, panel)));
		buttonContainer.add(
				createLuxuryButton("むずかしい", new Color(255, 80, 80), Color.WHITE, new CtrlDifficult(layout, panel)));

		/* 
		 * 		buttonContainer.add(Level.createLuxuryButton("むずかしい", new Color(255, 80, 80), Color.WHITE, e -> {
					メソッドを呼び出してボタンの操作を指定する
				}));       
		 */

		mainPanel.add(buttonContainer, BorderLayout.CENTER);

		// 3. 戻るボタン（下部左側）
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		southPanel.setOpaque(false);
		southPanel.setBorder(BorderFactory.createEmptyBorder(0, 40, 40, 0));

		JButton backBtn = new JButton("← 戻る");
		backBtn.setPreferredSize(new Dimension(150, 50));
		backBtn.setFont(new Font("MS Gothic", Font.BOLD, 18));
		backBtn.addActionListener(new CtrlMode(layout, panel));
		southPanel.add(backBtn);

		mainPanel.add(southPanel, BorderLayout.SOUTH);

		return mainPanel;
	}

	/**
	 * グラデーションと丸みのある豪華なボタンを作成する
	 */
	private JButton createLuxuryButton(String text, Color baseColor, Color textColor, ActionListener listener) {
		JButton button = new JButton(text) {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// グラデーション描画
				Color darker = baseColor.darker();
				GradientPaint gp = new GradientPaint(0, 0, baseColor, 0, getHeight(), darker);
				g2.setPaint(gp);
				g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

				// 枠線
				g2.setColor(new Color(0, 0, 0, 50));
				g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
				g2.dispose();
				super.paintComponent(g);
			}
		};

		button.setFont(new Font("MS Gothic", Font.BOLD, 28));
		button.setForeground(textColor);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.addActionListener(listener);
		return button;
	}
}