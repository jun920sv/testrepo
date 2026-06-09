package test.view;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class MainCardPanel extends JPanel {

	// レイアウトをフィールドに持つと、後で切り替えメソッドを作りやすい
	private CardLayout layout;
	public LoginPanel loginPanel;
	public MainPanel mainPanel;

	public MainCardPanel() {

		// 自分自身(this)にレイアウトをセットする
		layout = new CardLayout();
		this.setLayout(layout);

		// 各画面（子パネル）を用意する
		this.loginPanel = new LoginPanel(this);
		this.mainPanel = new MainPanel(this);

		// 自分自身(this)に、"名前"をつけて追加する
		this.add(this.loginPanel, "ログイン");
		this.add(this.mainPanel, "メイン");

		// 初期画面を表示（最初はログイン画面）
		layout.show(this, "ログイン"); 
	}

	// 外部から画面を切り替えるためのメソッドを作っておくと便利
	public void changePanel(String name) {
		layout.show(this, name);
		if(name.equals("メイン")) {
			this.mainPanel.serviceCardPanel.changePanel("入力画面");
		}
	}
}