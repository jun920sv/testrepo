package print02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("文字列Aを入力：");
		String strA = sc.nextLine();
		System.out.print("文字列Bを入力：");
		String strB = sc.nextLine();

		if (strA.equals(strB)) {
			System.out.println("ふたつの文字は等しいです");
		} else {
			System.out.println("ふたつの文字は等しくないです");
		}

	}

}
