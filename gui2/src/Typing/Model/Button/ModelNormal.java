package Typing.Model.Button;		
		
import java.awt.CardLayout;

import javax.swing.JPanel;

import Typing.Model.Time;		
		
public class ModelNormal {		
		
	public void service(CardLayout layout, JPanel panel) {	
		layout.show(panel,"スタート");
		Time.currentTime = Time.NORMAL;
	}	
		
}		
