package print02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("整数値aを入力：");
		int a = sc.nextInt();
		System.out.print("整数値bを入力：");
		int b = sc.nextInt();
		System.out.print("整数値cを入力：");
		int c = sc.nextInt();

		int max = a;
		int min = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		//Math.max() を使う場合
		max = Math.max(max, b);
		// 三項条件式
		max = max >= b ? max : b;
		
		min = Math.max(min, b);
		min = min <= b ? min :b;
		
		max = Math.max(max, c);
		min = Math.max(min, c);

		System.out.println("最大値" + max);
		System.out.println("最小値" + min);
		sc.close();
	}

}
