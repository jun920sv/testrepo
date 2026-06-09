package print15;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String words = "";

		do {
			System.out.println("文字:");
			words = sc.nextLine();
		} while (words.length() <= 3);
		System.out.printf("回文%s\n",isPalindrome(words)?"です":"じゃないです");
	}

	public static boolean isPalindrome(String words) {
		for (int i = 0; i < words.length(); i++) {
			char left = words.charAt(i);
			char right = words.charAt(words.length() - 1 - i);
			if (left != right) {
				return false;
			}

		}
		return true;

	}
}
