package Typing.Model.Button;		
		
import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.Timer;

import Typing.Model.LifePoint;
import Typing.Model.ProgressBar;
import Typing.Model.Score;
import Typing.Model.TimerManager;
import Typing.Model.TypingGameManager;
import Typing.Model.TypingKey;		
		
public class ModelRestart {	
	Timer timer = TimerManager.timerInstance().getTimer();
		
	public void service(CardLayout layout, JPanel panel, Score s) {	
		layout.show(panel,"スタート");
		s.scoreReset();
		timer.stop();
		//プログレスバーの初期化
		//hpやcurrentindexの初期化
		ProgressBar .getInstance() .reset();
		LifePoint.getInstance().reset();		
		TypingGameManager.getInstance().reset();
		TypingKey.getInstance().reset();
		
		
	}	
		
}		
		
