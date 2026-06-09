package Typing.Controller.ActionListener;				
				
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Typing.Model.SoundManager;
import Typing.Model.Button.ModelRanking2;
				
				
				
public class CtrlRanking2 implements ActionListener{				
	CardLayout layout;			
	JPanel panel;			
	ModelRanking2 mode;			
	public CtrlRanking2(CardLayout layer, JPanel pane) {			
		mode = new ModelRanking2();		
		layout = layer;		
		panel = pane;		
	}			
	@Override			
	public void actionPerformed(ActionEvent e) {	
	SoundManager.SELECT.play();//サウンド系追加		
		mode.service(layout, panel);		
	}			
				
}				
				
