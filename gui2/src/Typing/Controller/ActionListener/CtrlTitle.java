package Typing.Controller.ActionListener;			
			
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Typing.Model.Score;
import Typing.Model.SoundManager;
import Typing.Model.Button.ModelTitle;
			
			
public class CtrlTitle implements ActionListener{			
	CardLayout layout;		
	JPanel panel;
	Score score;
	ModelTitle mode;		
	public CtrlTitle(CardLayout layer, JPanel pane, Score s) {		
		mode = new ModelTitle();	
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
