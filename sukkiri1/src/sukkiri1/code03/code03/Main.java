package sukkiri1.code03.code03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String MSG = "メッセージ";

		System.out.println("文字を入力します");
		String input = sc.next();

		if (MSG.equals(input)) {
			System.out.println("同じ文字です");
		} else {
			System.out.println("違う文字です");
		}
		
		sc.close();
	}

}
