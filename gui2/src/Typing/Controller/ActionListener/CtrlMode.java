package Typing.Controller.ActionListener;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Typing.Model.SoundManager;
import Typing.Model.Button.ModelMode;


public class CtrlMode implements ActionListener{
	CardLayout layout;
	JPanel panel;
	ModelMode mode;
	public CtrlMode(CardLayout layer, JPanel pane) {
		mode = new ModelMode();
		layout = layer;
		panel = pane;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	SoundManager.SELECT.play();//サウンド系の追加
		mode.service(layout, panel);
	}
	
}
