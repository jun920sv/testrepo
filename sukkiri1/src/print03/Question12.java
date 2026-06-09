package print03;

import java.util.Scanner;

class J {

	static void a() {
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE+1);//オーバーフローしてMIN_VALUEになる
		System.out.println(Integer.MIN_VALUE);
		
		
		int min = Integer.MAX_VALUE;//最大値だから必ず小さくなる
		int max = Integer.MIN_VALUE;//最小値だから必ず大きくなる

		for (int i = 1; i <= 5; i++) {
			System.out.print("入力:");
			int a = sc.nextInt();
			if (a < min) {
				min = a;
			}
			if (a > max) {
				max = a;
			}
		}

		System.out.println("最小値は:" + min);
		System.out.println("最大値は:" + max);

	}
}

public class Question12 {
	public static void main(String[] args) {
		J.a();

	}

}
