package practice02_print01;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int r=300;//重さは変化することないので定数か
		final int m=140;

		// みかんを入力
		System.out.print("りんごの購入数：");
		String ringo = sc.next();
		int R = Integer.parseInt(ringo);

		System.out.print("みかんの購入数：");
		String mikan = sc.next();
		int M = Integer.parseInt(mikan);

		int Goukei = (r * R) + (m * M);

		System.out.println("合計:" + Goukei + "グラム");

		sc.close();
	}

}

/*りんご1 個３００グラム、みかん1 個１４０グラムの時、りんごＭ個、みかんＮ
個購入した時の重さの合計は何グラムになりますか？
ＭとＮにはキーボードから入力を行い、重さの合計を表示してください。
入出力の形は実行結果例の通りになるように記述してください。
実行結果例
りんごの購入数：3 //入力
みかんの購入数：2 //入力
合計：1180 グラム //表示
*/