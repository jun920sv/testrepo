package print03;

import java.util.Random;
import java.util.Scanner;

class Hand {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int meHand;
	int cpHand;
	int result;
	String owari;

	void me() {
		System.out.println("グー:0 チョキ:1 パー:2");
		meHand = sc.nextInt();
		sc.nextLine();
	}

	void cp() {
		cpHand = rand.nextInt(2);

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

	void jedge() {
		do {
			me();
			cp();
			hyou();
			result = (meHand - cpHand + 3) % 3;
			if (result == 0) {
				System.out.println("あいこです");
			} else if (result == 1) {
				System.out.println("あなたの負けです");
			} else {
				System.out.println("あなたの勝ちです");
			}
			System.out.println("じゃんけんを終了しますか？(y)");
			owari = sc.nextLine();

		} while (!owari.equals("y"));
		System.out.println("じゃんけん終了");
	}

}

public class Question21 {
	public static void main(String[] args) {
		Hand1 hand = new Hand1();
		/*	hand.me();
			hand.cp();
			hand.hyou();
			*/
		hand.jedge();

	}

}
