package practice02_print01;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		//Scanner の宣言
		Scanner sc = new Scanner(System.in);
		//名前の入力
		System.out.print("名前を入力してください");
		String name = sc.nextLine();
		
		//年齢の入力(int 型変数：age)
		System.out.print("年齢を入力してください");
		int age = sc.nextInt();// Integer.parseInt(sc.nextLine());　でも可
		
		System.out.print("身長を入力してください");
		double height = sc.nextDouble();//Double.parseDouble(sc.nextLine();でも可
		//身長(m)の入力（double 型変数：height）
		
		System.out.print("体重を入力してください");
		double weight =sc.nextDouble();//Double.parseDouble(sc.nextLine();でも可
		//体重(kg)の入力（double 型変数：weight)
		
		
		//BMI を求めてください（式：BMI ＝ 体重kg ÷ (身長m)2
		//※BMI は、体重(kg)を身長(m)の2 乗で割って算出する世界共通の肥満度指標です
		double bmi = weight / (height*height);// weight / Math.pow(height , 2);　でも可
		//double bmi = weight / Math.pow(height , 2);// weight / Math.pow(height , 2);　でも可
		
		
		//結果表示
		System.out.println(name + "さんのBMI は、" + bmi + "です");
			sc.close();

}

}
