package groupwork.test;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {

		JFrame frame = new JFrame("StoryGame仮仮");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(1280, 720);

		CreatePanel CP = new CreatePanel(frame);

//				BackgroundPanel bgPanel = CP.createBgPanel(CP.sm.getStory().getImagePath());
//		//インスタンス化したCPの中にあるsmのArrayListのget(0)のStoryClassのgetImagePathメソッドで取得
//		//希望の宇宙の…/うえだゆうじ の１番みたいになってる↑
//				frame.setContentPane(bgPanel);
//			CP.setOpaque(false);

		frame.add(CP);
		CP.realBGPanel.setOpaque(true);
		frame.setVisible(true);

	}

	//	public static void changeImage(String imagePath) {
	//		BackgroundPanel bgPanel = new BackgroundPanel(imagePath);
	//		
	//	}
}
