package Typing.Controller.ActionListener;				
				
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Typing.Model.SoundManager;
import Typing.Model.Button.ModelDifficult;
				
				
public class CtrlDifficult implements ActionListener{				
	CardLayout layout;			
	JPanel panel;			
	ModelDifficult mode;			
	public CtrlDifficult(CardLayout layer, JPanel pane) {			
		mode = new ModelDifficult();		
		layout = layer;		
		panel = pane;		
	}			
	@Override			
	public void actionPerformed(ActionEvent e) {	
	SoundManager.SELECT.play();//サウンド系追加			
		mode.service(layout, panel);		
	}			
				
}				
				
