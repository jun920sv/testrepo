
package Typing.Frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import Typing.Controller.ActionListener.CtrlTitle;
import Typing.Model.Score;

public class Use {

	BufferedImage useImage;
	CardLayout layout;
	JPanel panel;
	Score score;

	public Use() {


		try {
			File useFile = new File("USE.png");

			if (useFile.exists())
				useImage = ImageIO.read(useFile);

		} catch (IOException e) {
			System.out.println("画像読み込みエラー: " + e.getMessage());
		}
	}

	public JPanel TitlePanel(CardLayout layer, JPanel pane, Score s) {
		this.layout = layer;
		this.panel = pane;
		this.score = s;

		// ✅ 背景画像パネル
		JPanel mainPanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);

				if (useImage != null) {
					g.drawImage(useImage, 0, 0, getWidth(), getHeight(), this);
				}
			}
		};

		mainPanel.setLayout(new BorderLayout());

		// ✅ 右下ボタン用
		JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 50, 50));
		southPanel.setOpaque(false);

		// ✅ ボタン作成
		JButton backButton = new JButton("戻る");
		backButton.addActionListener(new CtrlTitle(layout,panel,score));
		
		// ★ サイズ2倍くらい
		backButton.setFont(new Font("メイリオ", Font.BOLD, 24)); // 文字大きめ
		backButton.setPreferredSize(new Dimension(100, 60)); // 幅・高さUP
		
		southPanel.add(backButton);

		mainPanel.add(southPanel, BorderLayout.SOUTH);

		return mainPanel;
	}
}
