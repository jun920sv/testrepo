package print02;

import java.util.Scanner;

class Keisan {
	int a, b;
	String c;

	Keisan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("四則演算を行います");
		System.out.println("数値を入力してください>>");
		a = sc.nextInt();
		System.out.println("数値を入力してください>>");
		b = sc.nextInt();
		System.out.println("算術演算子を入力してください>>");
		sc.nextLine();
		c = sc.nextLine();

	}

	int enzan() {
		switch (c) {
		case "+":
			System.out.println(a + b);
			return a+b;
		case "-":
			System.out.println(a - b);
			return a-b;
		case "*":
			System.out.println(a * b);
			return a*b;
		case "/":
			System.out.println(a / b);
			return a/b;
		default:
			System.out.println("存在しない演算子です");
		}
		return 0;

	}
}

public class Question11 {

	public static void main(String[] args) {

		Keisan siki = new Keisan();
		int kai = siki.enzan();
		System.out.println("結果: " + kai);

	}

}
