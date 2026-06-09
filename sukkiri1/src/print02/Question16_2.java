package print02;

import java.util.Scanner;

public class Question16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("月を入力してください（1～12の整数）");
		int month = sc.nextInt();
		switch (month) {
		case 3, 4, 5 -> {
			System.out.println("春です");
		}
		case 6, 7, 8 -> {
			System.out.println("夏です");
		}
		case 9, 10, 11 -> {
			System.out.println("秋です");
		}
		case 12, 1, 2 -> {
			System.out.println("冬です");
		}
		default ->
		System.out.println("無効な月です");
		
		}
	}
}