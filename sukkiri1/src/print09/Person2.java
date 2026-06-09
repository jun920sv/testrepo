package print09;

public class Person2 {

	//フィールド 
	private String name;
	private int age;

	//コンストラクタ 
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.printf("名前:%s,年齢:%d\n", this.name, this.age);
	}

	/* * メソッド名：show 
	 * * 引数：なし 
	 * * 戻り値：なし 
	 * * 処理：「名前：name , 年齢：age」の形で表示する 
	 * */

}
