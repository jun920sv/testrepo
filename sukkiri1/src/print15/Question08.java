package print15;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("パスワードを入力: ");
		String password = sc.nextLine();

		// パスワード強度チェックメソッドを呼ぶ 

		boolean result = checkPassword(password);

		if (result) {
			System.out.println("安全なパスワードです");
		} else {
			System.out.println("安全ではないパスワードです");
		}
	}

	// パスワード強度チェックメソッド 

	public static boolean checkPassword(String password) {
		if (password.length() < 8) {
			return false;
		}// .*すべての文字0文字以上 
		if (!password.matches(".*[0-9].*")) {// 5abcdefghij もabcdefghi5もtrue
			return false;
		}
		return password.matches(".*[a-zA-Z].*");

	}
}
