package test;

import test.view.MainCardPanel;
import test.view.MainFrame;

public class TestMain {
	public static void main(String[] args) {
		
			MainFrame testF = new MainFrame();
			
			new Member();
			new ShiftType();
			MainCardPanel mcp = new MainCardPanel();
			
			testF.add(mcp);
			testF.setVisible(true);

		}
	}