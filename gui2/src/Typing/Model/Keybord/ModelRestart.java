package Typing.Model.Keybord;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ModelRestart {
	public void service(CardLayout layer, JPanel pane) {
		//一時停止から再開するとき
		layer.show(pane, "プレイ");
		
	}
}
