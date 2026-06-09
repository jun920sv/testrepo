package print14.Question06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {

		//Person型のArrayListを宣言する 変数名：list

		ArrayList<Person> list = new ArrayList<Person>();

		/*
		 * listに以下の4人を追加する
		 * 1人目：Bob　30歳
		 * 2人目：Alice　20歳
		 * 3人目：John　40歳
		 * 4人目：Carol　25歳
		 */

		list.add(new Person("Bob", 30));
		list.add(new Person("Alice", 20));
		list.add(new Person("John", 40));
		list.add(new Person("Carol", 25));

		//ソート条件を指定する
		String str = "AGE"; //NAME or AGE

		//ファクトリーメソッドを使って、Comparator型インスタンスを取得
		Comparator<Person> c = ComparatorFactory.createComparator(str);

		

		//Comparatorを使ってソートする
		Collections.sort(list, c);

		//拡張for文で順番に表示（toString)
		for (Person p : list) {
			System.out.println(p.toString());
		}

	}

}
