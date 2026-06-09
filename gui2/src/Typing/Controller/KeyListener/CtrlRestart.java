package Typing.Controller.KeyListener;

import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

import Typing.Model.Keybord.ModelRestart;

public class CtrlRestart extends KeyAdapter{
	CardLayout layout;
	JPanel panel;
	ModelRestart mode;
	
	public CtrlRestart(CardLayout layer, JPanel pane) {
		layout = layer;
		panel = pane;
		mode = new ModelRestart();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			mode.service(layout, panel);
		}
	}
}
