package print09;

public class Address {

	String Prefecture;//都道府県 
	String City;//市区町村 
	
	
	//コンストラクタ 
	public Address(String Prefecture,String City) {
		this.Prefecture=Prefecture;
		this.City=City;
	}
	
	
public	String getFullAddress(){
		
	//return Prefecture +" "+ City;
	return "%s %s".formatted(this.Prefecture,this.City);
	//return "%s %s".formatted(this.Prefecture,this.City);
		
	}
	
/* * メソッド名：getFullAddress 
 * * 引数：なし 
 * * 戻り値：String型 
 * * 処理：「都道府県 市区町村」の形の文字列を返す。 
 * * ※半角スペースで区切る */ 
	

}
