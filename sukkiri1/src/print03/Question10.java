package print03;

import java.util.Scanner;

class H {

	void a() {
		Scanner sc = new Scanner(System.in);

		String a = null;

		do {
			System.out.print("入力:");
			a = sc.next();
			if (a.equals("ABC")) {
				System.out.println("プログラムの終了");

			}

		} while (!a.equals("ABC"));
		sc.close();
	}

}

public class Question10 {
	public static void main(String[] args) {
		H c = new H();
		c.a();

	}

}
