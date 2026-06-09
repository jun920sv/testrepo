package Typing.Model;

public class LifePoint {
	int myPoint = 5;
	int enemyPoint = 5;
	private static LifePoint instance;
	
	public LifePoint() {
		instance = this;
	}
	
	public static LifePoint getInstance() {
	    return instance;
	}
	
	public void reset() {
	    myPoint = 5;
	    enemyPoint = 5;
	}

	//ゲッター
	public int getMyPoint() {
		return this.myPoint;
	}

	public int getEnemyPoint() {
		return this.enemyPoint;
	}
	
	//セッター
	public void MinusMyPoint() {
		this.myPoint--;
		SoundManager.TIME_OVER.play();
	}
	
	public void MinusEnemyPoint() {
		this.enemyPoint--;
	}
	
	// =====================================
	// 敵HP設定
	// =====================================

	public void setEnemyPoint(
	        int point) {

	    this.enemyPoint = point;
	}
}
