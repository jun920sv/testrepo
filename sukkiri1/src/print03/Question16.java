package print03;

import java.util.Scanner;

class L {
	static void a() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nを入力:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print("*");

				}

			}
			System.out.println("");
		}
	}

}

public class Question16 {
	public static void main(String[] args) {
		L.a();

	}

}
