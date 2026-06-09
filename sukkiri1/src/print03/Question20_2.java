package print03;

import java.util.Random;
import java.util.Scanner;

class Omikuji {
	Scanner sc;
	Random rand;
	int random;
	String conti;

	Omikuji() {
		sc = new Scanner(System.in);
		rand = new Random();
	}

	void draw() {
		random = rand.nextInt(7);
	}

	void show() {
		switch (random) {
		case 0 -> System.out.println("大吉");
		case 1 -> System.out.println("吉");
		case 2 -> System.out.println("中吉");
		case 3 -> System.out.println("小吉");
		case 4 -> System.out.println("末吉");
		case 5 -> System.out.println("凶");
		case 6 -> System.out.println("大凶");
		}

	}

	void kakunin() {
		System.out.println("おみくじを終了しますか？(y)");
	}

	boolean end() {
		conti = sc.nextLine();
		return !conti.equals("y");

	}
}

public class Question20_2 {
	public static void main(String[] args) {

		Omikuji a = new Omikuji();

		do {
			a.draw();
			a.show();
			a.kakunin();

		} while (a.end());
		System.out.println("おみくじ終了");
	}

}
