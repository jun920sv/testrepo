package Typing.Controller.ActionListener;				
				
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Typing.Model.Score;
import Typing.Model.SoundManager;
import Typing.Model.Button.ModelRestart;
				
				
public class CtrlRestart implements ActionListener{				
	CardLayout layout;			
	JPanel panel;
	Score score;			
	ModelRestart mode;			
	public CtrlRestart(CardLayout layer, JPanel pane, Score s) {			
		mode = new ModelRestart();		
		layout = layer;		
		panel = pane;
		score = s;		
	}			
	@Override			
	public void actionPerformed(ActionEvent e) {
	SoundManager.SELECT.play();//サウンド系追加			
		mode.service(layout, panel, score);		
	}			
				
}				
