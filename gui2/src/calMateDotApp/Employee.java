package calMateDotApp;

import javax.swing.ImageIcon;

/*
 * メンバー生成クラス用の抽象クラス
 */
public abstract class Employee{
	private String name;
	private int attend;
	private String role;
	private ImageIcon icon;
	
	protected Employee(String name, String role, int attend, ImageIcon icon) {
		this.name = name;
		this.attend = attend;
		this.role = role;
		this.icon = icon;
	}
	
	public void incrementAttend() {
		this.attend++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAttend(int attend) {
		this.attend = attend;
	}
	
	public int getAttend() {
		return this.attend;
	}
	
	public String getRole() {
		return this.role;
	}
	
	// フルサイズ画像
	public ImageIcon getIcon() {
		return this.icon;
	}
/*
	// 縮小画像
	public ImageIcon getScaledIcon() {
		Image scaledIcon = this.icon.getImage();
		return new ImageIcon(scaledIcon);
	}
*/
}
