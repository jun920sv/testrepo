package print02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("入力：");
		int a = sc.nextInt();

		if (a <= 0) {
			System.out.println("0以下の数値が入力されました");
		} else if (a % 2 == 0) {
			System.out.println("その値は偶数です。");
		} else if (a % 2 != 0) {
			System.out.println("その値は奇数です。");
		} else {
			//	System.out.println("正しい数値を入れてください");
		}
		sc.close();
	}

}
