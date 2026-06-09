package Typing.Frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Typing.Controller.ActionListener.CtrlRestart;
import Typing.Controller.ActionListener.CtrlTitle;
import Typing.Model.Score;
import Typing.Model.TimerManager;

public class Pause extends JPanel {
	private Image backgroundImage;

	// 外部のロジックからボタンのクリックを検知できるようにpublicで公開
	public JButton resumeButton; // 「ゲームに戻る」ボタン
	public JButton titleButton; // 「タイトルへ戻る」ボタン
	
	
	public Pause(CardLayout layout, JPanel panel, Score score) {
		// --- 1. 背景画像の読み込み ---
		try {
			backgroundImage = ImageIO.read(new File("3.png"));
		} catch (Exception e) {
			System.out.println("Pause画面: 背景画像 3.png が見つかりません。");
		}

		// --- 2. レイアウトの構築 ---
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;

		// 1. 「PAUSE」大文字タイトル
		JLabel pauseLabel = new JLabel("PAUSE", JLabel.CENTER);
		pauseLabel.setFont(new Font("Arial", Font.BOLD, 70));
		pauseLabel.setForeground(Color.WHITE);
		gbc.gridy = 0;
		gbc.insets = new Insets(0, 0, 40, 0);
		add(pauseLabel, gbc);

		// 2. 「ゲームに戻る」ボタン
		resumeButton = createPauseButton("最初から始める", new CtrlRestart(layout, panel,score));
		gbc.gridy = 1;
		gbc.insets = new Insets(10, 0, 10, 0);
		add(resumeButton, gbc);

		// 3. 「タイトルへ戻る」ボタン
		titleButton = createPauseButton("タイトルへ戻る", new CtrlTitle(layout, panel, score));
		gbc.gridy = 2;
		gbc.insets = new Insets(10, 0, 60, 0); // 下に少し余白を設ける
		add(titleButton, gbc);

		// 4. 「キーボードで再開」ラベル（PAUSEの70ptより大きい80ptで設定）
		JLabel restartLabel = new JLabel("スペースで再開", JLabel.CENTER);
		restartLabel.setFont(new Font("MS Gothic", Font.BOLD, 80));
		restartLabel.setForeground(Color.WHITE);
		gbc.gridy = 3;
		gbc.insets = new Insets(0, 0, 0, 0);
		add(restartLabel, gbc);

		this.addKeyListener(new Typing.Controller.KeyListener.CtrlRestart(layout, panel));

		this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
				.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, 0), "space");

		this.getActionMap().put("space", new javax.swing.AbstractAction() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// spaceキーが押されたときの処理を実行
				layout.show(panel, "プレイ");
				TimerManager.timerInstance().timerStart();
				
			}
		});
		setFocusable(true);
		requestFocusInWindow();

	}

	/**
	 * ポーズ画面専用の白いツヤのあるボタンデザインを生成するメソッド
	 */
	private JButton createPauseButton(String text, ActionListener listener) {
		JButton btn = new JButton(text);
		btn.setFont(new Font("MS Gothic", Font.PLAIN, 24));
		btn.setForeground(Color.BLACK);

		btn.setBackground(new Color(230, 240, 250));
		btn.setPreferredSize(new Dimension(300, 55));

		btn.setFocusPainted(false);
		btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

		btn.addActionListener(listener);

		return btn;
	}

	// --- 3. 背景画像の描画処理 ---
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (backgroundImage != null) {
			g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
			g.setColor(new Color(0, 0, 0, 120));
			g.fillRect(0, 0, getWidth(), getHeight());
		} else {
			setBackground(new Color(100, 103, 105));
		}
	}
}