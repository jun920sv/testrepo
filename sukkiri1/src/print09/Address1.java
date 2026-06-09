package print09;

public class Address1 {
	private Person1 owner;
	private String city;//市区町村 

	//コンストラクタ 
	public Address1(Person1 person, String city) {
		this.city = city;
	}

	public void setOwner(Person1 owner) {
		this.owner=owner;
		if(owner.getAddress()!=this) {
			owner.setAddress(this);
		}
	}

	public Person1 getOwner() {
		return owner;

	}

	public String getCity() {
		return city;

	}

	/* * メソッド名：getFullAddress 
	 * * 引数：なし 
	 * * 戻り値：String型 
	 * * 処理：「都道府県 市区町村」の形の文字列を返す。 
	 * * ※半角スペースで区切る */

}
