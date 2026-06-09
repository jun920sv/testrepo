package Typing.Controller.ActionListener;				
				
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Typing.Model.SoundManager;
import Typing.Model.Button.ModelExitTitle;
			
				
				
public class CtrlExitTitle implements ActionListener{				
	CardLayout layout;			
	JPanel panel;			
	ModelExitTitle mode;			
	public CtrlExitTitle(CardLayout layer, JPanel pane) {			
		mode = new ModelExitTitle();		
		layout = layer;		
		panel = pane;		
	}			
	@Override			
	public void actionPerformed(ActionEvent e) {	
	SoundManager.SELECT.play();//サウンド系追加		
		mode.service(layout, panel);		
	}			
				
}				
				
