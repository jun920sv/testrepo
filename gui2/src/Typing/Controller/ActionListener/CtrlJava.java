package Typing.Controller.ActionListener;				
				
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Typing.Model.SoundManager;
import Typing.Model.Button.ModelJava;
				
				
public class CtrlJava implements ActionListener{				
	CardLayout layout;			
	JPanel panel;			
	ModelJava mode;			
	public CtrlJava(CardLayout layer, JPanel pane) {			
		mode = new ModelJava();		
		layout = layer;		
		panel = pane;		
	}			
	@Override			
	public void actionPerformed(ActionEvent e) {	
	SoundManager.SELECT.play();//サウンド系追加			
		mode.service(layout, panel);		
	}			
				
}				
