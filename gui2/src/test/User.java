package test;

public class User {
	private String id;
	private String password;
	private String familyName; //苗字
	private String firstName; //名前
	private ShiftType shiftType;
	

	public User(String familyName,String firstName,String id,String password) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.id = id;
		this.password = password;
//		this.shiftType = null;
	}
	
	//ID取得
	public String getId() {
		return this.id;
	}
	//パスワード取得
	public String getPassword() {
		return this.password;
	}
	//苗字取得
	public String getFamilyName() {
		return this.familyName;
	}
	//下の名前取得
	public String getFirstName() {
		return this.firstName;
	}
	//フルネーム取得
	public String getFullName() {
		return this.familyName + " " + this.firstName;
	}
	//勤務時間取得
	public ShiftType getShiftType() {
		return this.shiftType;
	}
	
	
	//勤務時間追加
	public void setShiftType(ShiftType st) {
		this.shiftType = st;
	}
	
	
	
	//空かどうか nullならfalse
	public boolean hasShiftType() {
		return this.shiftType != null ? true : false; 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User u2) {
			if(this.getId().equals(u2.getId()) && this.getPassword().equals(u2.getPassword())) {
				return true;
			}
		}
		return false;
	}
}

