package practice03_print01;

import java.util.Random;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("数あてゲーム");
		int ans = random.nextInt(10);

		for (int i = 1; i <= 5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = sc.nextInt();
			if (num == ans) {
				System.out.println("アタリ!");
				break;

			} else if (num != ans) {
				System.out.println("違います");

			}

		}
		System.out.println("ゲームを終了します");
		sc.close();
	}

}
