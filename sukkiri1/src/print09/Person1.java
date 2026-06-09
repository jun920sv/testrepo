package print09;

public class Person1 {
	private String name;//名前
	private Address1 address; //Person has an Address（インスタンス）
	
	//コンストラクタ
	public Person1(String name){
		this.name=name;
		
	}
	public void setAddress(Address1 address) {
		this.address=address;
		if(address.getOwner() !=this) {
			address.setOwner(this);
			
		}
	}
	
	public Address1 getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}

	
	
	public void introduce() {
		System.out.printf("%sの住所は:%sです\n",this.name,this.address.getCity());
		
	}
/* * メソッド名：introduce 
 * * 引数：なし 
 * * 戻り値：なし 
 * * 処理：「名前(年齢歳) 住所： 」の形で表示する 
 * */ 
	

}


