package print14.Question06;

public class Person {
	private String name;	//名前
	private int age;		//年齢
	//コンストラクタ（引数：String name, int age）
	
	Person(String name, int age){
		this.name = name;
		this.age = age;

	}
	//getNameメソッド
	public String getName() {
		return name;
	}
	
	//getAgeメソッド
	public int getAge() {
		return age;
	}
	
	//toStringメソッドのオーバーライド　「〇〇さんの年齢は××歳です」の形で表示
	public String toString() {
		return name + "さんの年齢は" + age + "歳です";
	}

}
