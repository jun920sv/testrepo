package test.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import test.ShiftType;

public class TimeGraphPanel extends JPanel{
	int time;
	public TimeGraphPanel() {
		this.time = ShiftType.end-ShiftType.start+2;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int height = this.getHeight()/this.time;
		int n = 0;
		g.setColor(Color.BLACK);
		g.setFont(new Font("MS_ゴシック",Font.PLAIN,15));
		for(int i = 7;i <= 22;i++) {
			g.drawString(String.valueOf(i), 8, (n*height + height));
			n++;
		}
	}
}
