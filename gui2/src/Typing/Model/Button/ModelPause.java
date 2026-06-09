package Typing.Model.Button;		
		
import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.Timer;

import Typing.Model.TimerManager;		
		
public class ModelPause {		
	Timer timer = TimerManager.timerInstance().getTimer();
	public void service(CardLayout layout, JPanel panel) {	
		layout.show(panel,"ポーズ");
		timer.stop();
	}	
		
}		
