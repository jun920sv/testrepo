package print11.Question03;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//ArrayListの宣言  変数名：members
		List<Member> members = new ArrayList<Member>();//<Member>を管理するから　<>管理する型
		//Memberクラスのインスタンスを生成。引数：一般
		members.add(new Member("一般"));
		//GoldMemberクラスのインスタンスを生成。引数：ゴールド
		members.add(new GoldMember("ゴールド"));
		//値段
		int price = 1000;
		//ArrayListを順番に回し、値段を引数にポイントを取得し表示する。

		for (Member m : members) {
			System.out.printf("%s:%dポイント\n", m.getName(), m.getPoint(price));
		}
	}
}
