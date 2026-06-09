package sukkiri1.code03.code06;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		Random rand = new Random();
		int fortune = rand.nextInt(4) + 1;//1～4の乱数を生成
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");

		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}
		final int a = 4;
		switch (fortune) {
		case a -> {
			System.out.println("大吉");
		}
		case 2 -> {
			System.out.println("中吉");
		}
		case 3 -> {
			System.out.println("吉");
		}
		default -> {
			System.out.println("凶");
		}

		}
	}

}
