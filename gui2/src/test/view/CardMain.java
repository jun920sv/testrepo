package test.view;

import javax.swing.JFrame;

import test.ShiftType;

public class CardMain {
	public static void main(String[] args) {
		JFrame f = new JFrame("test");
		f.setSize(375,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ShiftType st = new ShiftType();
//		System.out.println(ShiftType.total);
//		MainCardPanel mcp = new MainCardPanel();
//		f.add(mcp);
		MainCardPanel mcp = new MainCardPanel();
		f.add(mcp);
		f.setVisible(true);
	}
}
