package Typing.Model.Keybord;

import java.awt.CardLayout;

import javax.swing.JPanel;

import Typing.Model.TimerManager;

public class ModelPlay {
	TimerManager timer;
	
	public void service(CardLayout layer, JPanel pane) {
		timer = TimerManager.timerInstance();
		layer.show(pane, "プレイ");
		timer.timerStart();
	}
}
