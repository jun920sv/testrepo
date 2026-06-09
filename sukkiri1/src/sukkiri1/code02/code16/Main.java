package sukkiri1.code02.code16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);//読み込み

		System.out.println("あなたの名前を入力してください");
		String name = scanner.nextLine();//混在注意　

//		System.out.println("あなたの名前を入力してください");
//		String rei = scanner.next();//ENTERを押した瞬間 改行空白まで　
		
		System.out.println("あなたの年齢を入力してください");
		int age = scanner.nextInt();//int 整数受付のため　他のNG

		System.out.println("あなたの体重を入力してください");
		double weight = scanner.nextDouble();//

		System.out.println("ようこそ" + age + "歳の" + name
				+ "さん" + weight + "体重");
		scanner.close();
	}
}
