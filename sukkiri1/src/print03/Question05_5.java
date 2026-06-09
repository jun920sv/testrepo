package print03;

import java.util.Scanner;

class C {

	void a() {
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		double result = 0;
		for (double i = 1; i <= 5; i++) {
			System.out.println("文字を入力してください");
			sum = sc.nextDouble();
			result += sum;

		}
		System.out.println("平均:" + result / 5);
		sc.close();
	}

}

public class Question05_5 {
	public static void main(String[] args) {
		C c = new C();
		c.a();

	}

}
