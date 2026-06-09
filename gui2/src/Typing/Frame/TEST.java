
package Typing.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TEST {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ジャバレンジャー");
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		
		
//		frame.add(new Pause());
		
		
		frame.setVisible(true);
	}

}
/*追加部分
this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
.put(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE,0),"escape");

this.getActionMap().put("escape_action", new javax.swing.AbstractAction() {
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// Escキーが押されたときの処理を実行
		layout.show(panel, "ポーズ");
	}
});
setFocusable(true);
requestFocusInWindow();
追加部分
pauseBtn.addMouseListener(new CtrlFocus(pauseBtn,this));
*/


/*
package Typing.Frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Typing.Model.Score;

public class TEST {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ジャバレンジャー");
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1. テスト用のスコアデータを作成
		Score mockScore = new Score();
		mockScore.PlusScore(); // 10点加点
		mockScore.PlusScore(); // さらに10点加点 (計20点)
		mockScore.setMiss();   // ミスを1回にする
		mockScore.setAccuracy(); // 正確性を計算させる (20 / 21 ≒ 95.2%)

		JPanel panel = new JPanel(new BorderLayout()); // レイアウト崩れを防ぐためBorderLayoutを推奨
		
		// 2. 作成したデータをResultPanelに引数として渡す
		panel.add(new Result().ResultPanel(mockScore));
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
package Typing.Frame;

import javax.swing.JFrame;

public class TEST {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ジャバレンジャー - 動的ステージテスト");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        // 新しいPlay_Bossパネルを追加（メソッド呼び出し不要、そのままadd！）
        Play_Boss playBossPanel = new Play_Boss();
        frame.add(playBossPanel);
        
        frame.setVisible(true);
        
        // ★キーボードのタイピング入力を最初から有効化するための必須コード
        playBossPanel.requestFocusInWindow();
    }
}
 */
