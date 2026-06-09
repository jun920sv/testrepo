package print02;

import java.util.Scanner;

public class Question01 {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("整数値を入力：");
			int selected = sc.nextInt();
			
			if(selected >5) {
				System.out.println("5より大きい値です");
				
			}
			
		}
}
/*
実行結果例 (5より大きい値)
整数値を入力：10 (キーボード入力)
5より大きい値です。
*/