package print03;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("入力回数:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("整数値を入力:");
			int input = sc.nextInt();
			if (sum + input >= 1000) {
				System.out.println("合計が1000超えました。"
						+ "\n最後の数値は無視します。");
				break;
			} else {
				sum =sum+input;
			
			}
			
		}
		System.out.println("合計"+sum);
	}
}
