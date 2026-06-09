package print03;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		int sum = 0;
		while (true) {
			System.out.print("入力:");
			int put = sc.nextInt();
			if (put < 0) {
				continue;
			}

			if (put > 0) {
				sum += put;
			}
			if (put == 0) {
				break;
			}

		}
		System.out.println("合計は" + sum + "です");//\n エスケープシーケンス
		sc.close();
	}

}
