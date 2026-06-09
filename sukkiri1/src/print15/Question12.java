package print15;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ユーザーID配列
		String[][] users = { { "tanaka", "a1S2d#" },
				{ "suzuki", "PassWord0000" },
				{ "sato", "Q1w2E4" },
				{ "yamada", "Z!x2c%d" } };
		System.out.print("ユーザーIDを入力してください: ");
		String inputId = sc.nextLine();
		System.out.print("パスワードを入力してください: ");
		String inputPassword = sc.nextLine();

		// メソッド呼び出し
		boolean result = loginCheck(users, inputId, inputPassword);
		if (result) {
			System.out.println("ログイン成功");
		} else {
			System.out.println("ユーザーIDまたはパスワードが違います");
		}
	}

	public static boolean loginCheck(String[][] users, String id, String pass) {
		for (String[] user : users) {
			if (user[0].equals(id) && user[1].equals(pass)) {
				return true;
			}
		}
		return false;
	}

	// ログイン判定メソッド 
	public static boolean loginCheck(String[] users, String inputId) {
		for (int i = 0; i < users.length; i++) {
			if (users[i].equals(inputId)) {
				return true;
			}
		}
		return false;
	}
}
