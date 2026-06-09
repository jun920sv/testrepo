package print03;

import java.util.Random;
import java.util.Scanner;

class P {
	static void a() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String owari;

		do {
			int ran = rand.nextInt(7);
			switch (ran) {
			case 0 -> System.out.println("大吉");
			case 1 -> System.out.println("吉");
			case 2 -> System.out.println("中吉");
			case 3 -> System.out.println("小吉");
			case 4 -> System.out.println("末吉");
			case 5 -> System.out.println("凶");
			case 6 -> System.out.println("大凶");
			}
			System.out.println("おみくじを終了しますか？(y)");
			owari = sc.nextLine();
		} while (!owari.equals("y"));
		System.out.println("おみくじ終了");
		

	}
}

public class Question20 {
	public static void main(String[] args) {
		P.a();

	}

}
