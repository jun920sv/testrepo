package print09;

public class Person {
	private String name;//名前
	private int age;//年齢 
	private Address address; //Addressクラスのインスタンスが格納される 
	
	
	//コンストラクタ
	public Person(String name,int age,Address addresss){
		this.name=name;
		this.age=age;
		this.address=addresss;
	}
		

	public void introduce() {
		System.out.printf("%s(%d歳)住所:%s",this.name,this.age,this.address.getFullAddress());
		
	}
/* * メソッド名：introduce 
 * * 引数：なし 
 * * 戻り値：なし 
 * * 処理：「名前(年齢歳) 住所： 」の形で表示する 
 * */ 
	

}

