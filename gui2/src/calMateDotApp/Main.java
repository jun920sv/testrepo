package calMateDotApp;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		MemberList member = new MemberList();

		SaveAndLoadManager load = new SaveAndLoadManager();
		load.load(member.getMaidList(), member.getFairyList());

		JFrame frame = new JFrame("きゃるめいと♡どっと 大阪本店");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1100, 700);
		
		// 統合パネル
		frame.add(new CreateAllPanel(member));
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
