package rankingPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RankingPanels {

	// ===== ランキング① =====
	public static JPanel createRanking1(CardLayout layout, JPanel parent) {

		JPanel panel = new JPanel(new BorderLayout());

		JTextArea area = new JTextArea();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 30; i++) {
			sb.append(i + "位：" + i + "\n");
		}
		area.setText(sb.toString());
		JScrollPane scroll = new JScrollPane(area);

		JButton button = new JButton("閉じる");
		button.addActionListener(e -> layout.previous(parent));

		panel.add(scroll, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);

		return panel;
	}

	// ===== ランキング② =====
	public static JPanel createRanking2(CardLayout layout, JPanel parent) {

		JPanel panel = new JPanel(new BorderLayout());

		JTextArea area = new JTextArea();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 30; i++) {
			sb.append(i + "位：" + i + "\n");
		}
		area.setText(sb.toString());

		JScrollPane scroll = new JScrollPane(area);

		JButton button = new JButton("閉じる");
		button.addActionListener(e -> layout.previous(parent));

		panel.add(scroll, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);

		return panel;
	}
}
