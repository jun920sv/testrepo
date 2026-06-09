package Typing.Controller.KeyListener;

import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import Typing.Model.Keybord.ModelPlay;

public class CtrlPlay extends KeyAdapter {
	CardLayout layout;
	JPanel panel;
	ModelPlay mode;
	Timer gametimer;
	
	public CtrlPlay(CardLayout layer, JPanel pane) {
		layout = layer;
		panel = pane;
		mode = new ModelPlay();
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			mode.service(layout, panel);
		}
	}
}
