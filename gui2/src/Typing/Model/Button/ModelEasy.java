package Typing.Model.Button;			
			
import java.awt.CardLayout;

import javax.swing.JPanel;

import Typing.Model.Time;			
			
public class ModelEasy {			
			
	public void service(CardLayout layout, JPanel panel) {		
		layout.show(panel,"スタート");	
		Time.currentTime = Time.EASY;
	}		
			
}			
