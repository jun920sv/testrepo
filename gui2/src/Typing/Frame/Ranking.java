
package Typing.Frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Typing.Controller.ActionListener.CtrlExitResult;
import Typing.Model.Score;

//リザルト画面から遷移するランキング
public class Ranking {
	Score score;
	Ranking(Score s) {
		score = s;
	}
	public JPanel createRanking1(CardLayout layout, JPanel panel) {

		// ✅ 外側
		JPanel outerPanel = new JPanel(new BorderLayout());
		outerPanel.setBackground(Color.BLACK);

		// =========================
		// ✅ ランキング部分
		// =========================
		JPanel rankingPanel = new JPanel();
		rankingPanel.setLayout(new BoxLayout(rankingPanel, BoxLayout.Y_AXIS));
		rankingPanel.setBackground(Color.WHITE);

		// ✅ データ
		List<Integer> list = score.sortSQL();

		// ✅ 表示
		for (int i = 0; i < list.size(); i++) {

			int rank = i + 1;
			int score = list.get(i);

			JLabel label = new JLabel(rank + "位  " + score);

			// ✅ 色分け（順位ごと）
			if (i == 0) {
				label.setForeground(new Color(255, 215, 0)); // 金
				label.setBackground(Color.BLACK);
				label.setOpaque(true);
			} else if (i == 1) {
				label.setForeground(new Color(192, 192, 192)); // 銀
				label.setBackground(Color.BLACK);
				label.setOpaque(true);
			} else if (i == 2) {
				label.setForeground(new Color(184, 115, 51)); // 銅
				label.setBackground(Color.BLACK);
				label.setOpaque(true);
			} else {
				label.setForeground(Color.BLACK);
			}

			// ✅ フォント（全部同じ）
			label.setFont(new Font("メイリオ", Font.BOLD, 36));

			// ✅ 中央寄せ
			label.setAlignmentX(Component.CENTER_ALIGNMENT);

			rankingPanel.add(Box.createVerticalStrut(12));
			rankingPanel.add(label);
		}

		// ✅ スクロール
		JScrollPane scroll = new JScrollPane(rankingPanel);
		scroll.setBorder(null);
		scroll.getViewport().setBackground(Color.BLACK);
		scroll.getVerticalScrollBar().setUnitIncrement(20);

		// =========================
		// ✅ 戻るボタン
		// =========================
		JButton button = new JButton("戻る");

		button.setFont(new Font("メイリオ", Font.BOLD, 20));
		button.setPreferredSize(new Dimension(0, 60));
		button.setBackground(new Color(180, 180, 180));
		button.setForeground(Color.DARK_GRAY);
		button.addActionListener(new CtrlExitResult(layout, panel));
		button.setFocusPainted(false);

		JPanel bottom = new JPanel(new BorderLayout());
		bottom.setBackground(Color.BLACK);
		bottom.add(button, BorderLayout.CENTER);

		// =========================
		// ✅ 配置
		// =========================
		outerPanel.add(scroll, BorderLayout.CENTER);
		outerPanel.add(bottom, BorderLayout.SOUTH);

		return outerPanel;
	}
}
