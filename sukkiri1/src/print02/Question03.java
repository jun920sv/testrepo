package print02;

import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Aの整数値を入力：");
		int a = sc.nextInt();
		System.out.print("Bの整数値を入力：");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("aはbより大きいです。");

		} else if (a == b) {
			System.out.println("aとbの値は等しいです。");
		} else {
			System.out.println("aはbより小さいです。");
		}
	}
}