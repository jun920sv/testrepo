package calMateDotApp;

import javax.swing.ImageIcon;

public class Fairy extends Employee{
	private String staffRole;
	
	// プレーンメンバー生成用のコンストラクタ
	public Fairy(String name, String role, String staffRole, ImageIcon icon) {
		super(name, role, 0, icon);
		this.staffRole = staffRole;
	}
	
	// 初期メンバー生成用コンストラクタ
	public Fairy(String name, String role, int attend, String staffRole, ImageIcon icon) {
		super(name, role, attend, icon);
		this.staffRole = staffRole;
	}
	
	public void attendInc() {
		super.incrementAttend();
	}
	
	public String getStaffRole() {
		return this.staffRole;
	}
}
