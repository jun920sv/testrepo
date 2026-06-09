package calMateDotApp;

import javax.swing.ImageIcon;

public class Maid extends Employee{
	private int heart;
	private String rank;

	// プレーンメンバー生成用のコンストラクタ
	public Maid(String name, String role, ImageIcon icon) {
		super(name, role, 0, icon);
		this.heart = 0;
		updateRank();
	}
	
	// 初期メンバー生成用コンストラクタ
	public Maid(String name, String role, int attend, int heart, ImageIcon icon) {
		super(name, role, attend, icon);
		this.heart = heart;
		updateRank();
	}

	// 更新用メソッド
	public void attendInc(int hearts) {
		super.incrementAttend();
		this.heart += hearts;
		updateRank();
	}
	
	private void updateRank() {
		this.rank = new RankJudge(super.getAttend(), this.heart).getRank();
	}
	
	public void setHeart(int heart) {
		this.heart = heart;
		updateRank();
	}
	
	public int getHeart() {
		return this.heart;
	}
	
	public void setRank() {
		updateRank();
	}
	
	public String getRank() {
		return this.rank;
	}
}
