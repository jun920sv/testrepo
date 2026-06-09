package practice02_print01;

import java.util.Random;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner の宣言
		
		//文字数字①をキーボードから入力
		System.out.print("文字数字①の入力：");
		String s1 =sc.next();
		//int moji1 =Integer.parseInt(s1);	
				
		//文字数字②をキーボードから入力
		System.out.print("文字数字②の入力：");
		String s2 =sc.next();
		//int moji2 =Integer.parseInt(s2);
		
		
		//文字数字①をint 型に変換
		int i1 = Integer.parseInt(s1);
		//文字数字②をint 型に変換
		int i2 =Integer.parseInt(s2);
		
		//int 型に変換した二つの数を足し算する
		int result = i1 + i2;
		
		//足し算の結果を表示
		System.out.println(s1 + "+" + s2 + "=" + result);
		
		
		Random random = new Random();
		//Random の宣言

		//resultは上限の数を入れている変数名
		
		//乱数を用いて0～result（含まない）までのランダムな整数値を１つ取得
		int r1 =random.nextInt(result);
		
		//乱数値の表示
		System.out.println("乱数値：" + r1);
		
		//乱数を用いて10～(10 + result の2 倍)までのランダムな整数値を１つ取得
		int r2 =10+random.nextInt((result *2)+1);
		int r3 =random.nextInt(result * 2+ 1)+10;//模範解答の書き方

		//公式random.nextInt(乱数最大値+1("含む場合")-乱数の最小値)+乱数の最小値
		int r4 =random.nextInt(10+result * 2+ 1-10)+10;//模範解答の書き方
		
		System.out.println("乱数値：" + r2);
		System.out.println("乱数値：" + r3);
		System.out.println("乱数値：" + r4);
		
		sc.close();
		
	}

}
