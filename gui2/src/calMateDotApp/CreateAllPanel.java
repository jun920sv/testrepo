package calMateDotApp;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

public class CreateAllPanel extends JPanel {
	CardLayout cardLayout;
	JPanel container;

	public CreateAllPanel(MemberList member) {
		setLayout(new BorderLayout());
		//コンテナ(カードレイアウト)
		cardLayout = new CardLayout();
		container = new JPanel(cardLayout);
		//ログイン画面
		CreateOpeningPanel opnPnl = new CreateOpeningPanel(this);
		//メイン画面
		CreateMainPanel mainPnl = new CreateMainPanel(member);
		//コンテナにログイン画面とメイン画面を追加
		add(container);
		container.add(opnPnl, "opnPnl");
		container.add(mainPnl, "mainPnl");
		//最初はログイン画面を表示
		cardLayout.show(container, "opnPnl");
	}
	// パネル切り替え用メソッド
	public void showPanel(String name) {
		cardLayout.show(container, name);
	}
}
