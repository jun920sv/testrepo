package practice02_print01;

public class Main2 {

	public static void main(String[] args) {

		final String man = "男性";

		//定数 woman を宣言し、女性を代入してください。
		final String woman = "女性";

		//String 変数 name を宣言し Bob を代入
		String name = "Bob";

		//int 型変数 age を宣言し 20 を代入
		int age = 20;

		//名前と年齢と性別を表示する
		System.out.println(name + "さんは" + age + "歳で" + man + "です。");

		//name 変数に Alice を代入してください
		name = "Alice";
		//age 変数に 21 を代入してください
		age = 21;
		//「Alice さんは21 歳で女性です」となるように、変数
		System.out.println(name + "さんは" + age + "歳で" + woman + "です。");

	}

}
