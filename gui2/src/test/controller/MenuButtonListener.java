package test.controller;


import test.view.MainPanel;
import test.view.ServiceCardPanel;

public class MenuButtonListener  {
	//シフト表と申請画面押下時の処理
	public void changePanel(ServiceCardPanel scp,String panelName) {
		scp.changePanel(panelName);
	}
	
	//ログアウトボタン押下時
	public void logout(MainPanel mp) {
		mp.logout();
		mp.serviceCardPanel.clearRadio();
		mp.MCP.loginPanel.initialization();
		mp.MCP.changePanel("ログイン");
			
	}
	

}
