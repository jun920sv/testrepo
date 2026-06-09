package print02;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("文字列を入力してください");
		String a = sc.next();

		boolean b = a.equals("ABC");
		System.out.println("比較結果" + b);
		
		boolean d = a.equals("ABC")?true:false;
		System.out.println(d);
		
		System.out.println("数値を入力してください");
		int c = sc.nextInt();
		if (c <= 0) {
			System.out.println("0以下の値が入力されました");
		} else {
			if (c % 2 == 0) {
				System.out.println("偶数");
			} else {
				System.out.println("奇数");
			}
		}
		
		System.out.println(c%2 ==0 ? "偶数です":"奇数です");
		sc.close();
	}
}
