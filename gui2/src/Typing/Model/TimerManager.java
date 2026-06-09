package Typing.Model;

import javax.swing.Timer;

public class TimerManager {
private static TimerManager instance;
private Timer timer;
private int DELAY = 16;

public TimerManager() {
	timer = new Timer(DELAY,null);
}

public static TimerManager timerInstance() {
	if(instance == null) {
		instance = new TimerManager();
	}
	return instance;
}

public Timer getTimer() {
	return timer;
}

public void timerStart() {
	timer.start();
}

public void timerStop() {
	timer.stop();
}

}
