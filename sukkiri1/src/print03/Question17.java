package print03;

import java.util.Scanner;

class M {
	static void a() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nを入力:");
		int n = sc.nextInt();
		/*
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");//段落つけてる
		}
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("-");
			}

			for (int j = 0; j <= (n - i); j++) {
				System.out.print("*");
			}
			System.out.println("");//段落つけてる
		}
	}

}

public class Question17 {
	public static void main(String[] args) {
		//L.a();
		M.a();

	}

}
