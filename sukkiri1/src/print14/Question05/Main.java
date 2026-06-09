package print14.Question05;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		//Person型のArrayListを宣言する 変数名：list
		ArrayList<Person> list = new ArrayList<Person>();

		list.add(new Person("Bob", 30));
		list.add(new Person("Alice", 20));
		list.add(new Person("John", 40));
		list.add(new Person("Carol", 25));
		/*
		 * listに以下の4人を追加する
		 * 1人目：Bob　30歳
		 * 2人目：Alice　20歳
		 * 3人目：John　40歳
		 * 4人目：Carol　25歳
		 */

		//listをソートする
		Collections.sort(list);
		//拡張for文で順番に表示（toString)
		
		for(Person p :list) {
			System.out.println(p);
		}

	}
}
