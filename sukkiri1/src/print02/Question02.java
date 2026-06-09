package print02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("整数値を入力：");
		int selected = sc.nextInt();

		if (selected > 5) {
			System.out.println("5より大きい値です");

		}else {
			System.out.println("5以下の数値です");
		}

	}

}
