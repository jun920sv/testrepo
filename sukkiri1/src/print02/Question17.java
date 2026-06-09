package print02;

import java.util.Random;
import java.util.Scanner;

class Me {
	int meHand;

	Me() {
		Scanner sc = new Scanner(System.in);
		System.out.println("グー:0 チョキ:1 パー:2");
		this.meHand = sc.nextInt();
	}
}

class Cp {

	int cpHand;

	Cp() {
		Random rand = new Random();
		this.cpHand = rand.nextInt(3);
	}

}

class Judg {

	String Judg(int meHand, int cpHand) {
		if (meHand < 0 || meHand > 2) {
			return "入力が不正です";
		}
		int result = (meHand - cpHand + 3) % 3;
		if (result == 0) {
			return "あいこです";
		} else if (result == 1) {
			return "あなたの負けです";
		} else {
			return "あなたの勝ちです";
		}

	}

	String hand(int hand) {

		if (hand == 0) {
			return "グー";
		} else if (hand == 1) {
			return "チョキ";
		} else if (hand == 2) {
			return "パー";

		} else {
			return "不正です";
		}
	}
}

public class Question17 {
	public static void main(String[] args) {
		Me m = new Me();
		Cp c = new Cp();
		Judg j = new Judg();

		int m1 = m.meHand;
		int c1 = c.cpHand;

		String j1 = j.Judg(m1, c1);//判定してる　勝ち負け
		String meh = j.hand(m1);
		String cph = j.hand(c1);

		System.out.println(m1);//私の入力した数字
		System.out.println(c1);//CPのランダム数字
		System.out.println("私の手は" + meh);//ハンドメソッド対応
		System.out.println("Cpの手は" + cph);
		System.out.println(j1);

	}
}
