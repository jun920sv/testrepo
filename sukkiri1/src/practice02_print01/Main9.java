package practice02_print01;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//名前の入力
		System.out.print("名前は:");
		String name = sc.nextLine();
		
		//年齢は：21 
		System.out.print("年齢は:");
		int age = sc.nextInt();
		sc.nextLine();
		
		//趣味は：DIY 
		System.out.print("趣味は:");
		String hobby  = sc.nextLine();
		
		
		System.out.print("身長は:");
		double height = sc.nextDouble();
		
		double height2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("私の名前は"+name +"です");
		System.out.println("年齢は"+age+"歳で来年"+ ++age +"歳になります");
		System.out.println("趣味は"+hobby+"です");
		System.out.println("身長は"+height+"です。");

	}

}
/*
あなたはこれから自己紹介をします。
キーボードから、名前、年齢、趣味、身⾧を入力し実行結果例の形で表示してくだ
さい。
※年齢についてはインクリメントする必要があります。
実行結果例
名前は:Bob //入力
年齢は：21 //入力
趣味は：DIY //入力
身⾧は：182.5 //入力

私の名前はBob です //出力
年齢は21 歳で、来年22 歳になります //出力
趣味はDIY です //出力
身⾧は182.5cm です。 //出力 */