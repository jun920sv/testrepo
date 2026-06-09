package print02;

import java.util.Scanner;

class Season {
	int month;

	Season() {
		Scanner sc = new Scanner(System.in);
		System.out.println("月を入力してください（1～12の整数）");
		month = sc.nextInt();
		
	}

	String judg() {
		if (month == 3 || month == 4 || month == 5) {
			return "春です";

		} else if (month == 6 || month == 7 || month == 8) {
			return "夏です";
		} else if (month == 9 || month == 10 || month == 11) {
			return "秋です";
		} else if (month == 12 || month == 1 || month == 2) {
			return "冬です";
		} else {
			return "無効な月です";
		}
	}
}

public class Question16 {
	public static void main(String[] args) {
		Season a = new Season();
		String b = a.judg();
		System.out.println(b);
	}
}
