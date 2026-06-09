package print11.Question04;

public class Main {

	public static void main(String[] args) {

		/*
		 * 配列を宣言する。　変数名：animals
		 *  ①Dogクラス　引数：ポチ
		 *  ②Catクラス　引数：タマ
		 *  ③Sheepクラス　引数：モコ
		 *  ④Dogクラス　引数：ハチ
		*/

		Animal[] animals = {

				new Dog("ぽち"),
				new Cat("にゃ"),
				new Sheep("めー"),
				new Dog("わん")
		};

		for (int i = 0; i < animals.length; i++) {
			// 共通メソッド
			animals[i].eat();
			// 子クラス固有処理
			/*
			if (animals[i] instanceof Dog d) { //犬クラスのとき
							d.bark();
			} else if (animals[i] instanceof Cat c) { //猫クラスのとき
							c.scratch();
			} else if (animals[i] instanceof Sheep s) { //羊クラスのとき
							s.bleat();
			}
			*/
			switch (animals[i]) {
			case Dog d -> {
				d.bark();
			}
			case Cat c -> {
				c.scratch();
			}
			case Sheep s -> {
				s.bleat();
			}
			default -> {
				System.out.println("知らない");
			}
			}
			System.out.println("----");
		}
	}
}
