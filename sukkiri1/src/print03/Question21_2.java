package print03;

import java.util.Random;
import java.util.Scanner;

class Hand1 {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int meHand;
	int cpHand;
	int result;

	int me() {
		System.out.println("グー:0 チョキ:1 パー:2");
		return meHand = sc.nextInt();

	}

	int cp() {
		return cpHand = rand.nextInt(3);

	}

	void hyou() {

		//  System.out.println("グー:0 チョキ:1 パー:2");
		//   meHand = sc.nextInt();
		switch (meHand) {
		case 0 -> System.out.println("あなたはグーを出しました");
		case 1 -> System.out.println("あなたはチョキを出しました");
		case 2 -> System.out.println("あなたはパーを出しました");
		default -> System.out.println("入力が不正です");
		}
		cpHand = rand.nextInt(3);
		switch (cpHand) {
		case 0 -> System.out.println("Cpはグーを出しました");
		case 1 -> System.out.println("Cpはチョキを出しました");
		case 2 -> System.out.println("Cpはパーを出しました");
		}
	}

	String jedge() {

		result = (meHand - cpHand + 3) % 3;
		if (result == 0) {
			return "あいこです";
		} else if (result == 1) {
			return "あなたの負けです";
		} else {
			return "あなたの勝ちです";
		}

	}

}

public class Question21_2 {
	public static void main(String[] args) {
		Hand1 hand = new Hand1();
		Scanner sc = new Scanner(System.in);
		String owari;

		do {

			hand.me();
			hand.cp();
			hand.hyou();
			System.out.println(hand.jedge());
			System.out.println("じゃんけんを終了しますか？(y)");
			owari = sc.nextLine();
		} while (!owari.equals("y"));
		System.out.println("じゃんけん終了");

	}

}
