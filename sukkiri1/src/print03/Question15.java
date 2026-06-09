package print03;

import java.util.Scanner;

class K {

	static void a() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nを入力:");
		int n = sc.nextInt();
		/*
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						if (i % 2 == 0) {
							System.out.print("☆");
						} else {
							System.out.print("★");
						}
					}
				//	System.out.println("");
		
		*/

		for (int i = 1; i <= n; i++) {
			//	先にどちらを出力するか決める
			char star = (i % 2) != 0 ? '★' : '☆';
			for (int j = 1; j <= n; j++) {
				System.out.print(star);
			}
			System.out.println();

		}
	}
}

public class Question15 {
	public static void main(String[] args) {
		K.a();

	}

}
