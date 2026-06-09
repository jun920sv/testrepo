package practice02_print01;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//定数で数に意味を持たせる
		final int MINITES_PER_HOUR =60;
		final int SECONDS_PER_HOUR =60;

		
		System.out.print("時間を入力してください：");
		String jikan = sc.next();
		int time = Integer.parseInt(jikan);
		int byou = time * MINITES_PER_HOUR * SECONDS_PER_HOUR;		
		System.out.print(time +"時間は"+byou +"秒です");
		
		
		
		

	}

}

/*１時間は６０分です。１分は６０秒です。
キーボードからN 時間を入力した時の秒を計算して表示してください。
例えばキーボードから８と入力した時は、８時間→２８８００秒になります。
実行結果例の形に合わせて表示してください。
実行結果例
時間を入力してください：8
8 時間は28800 秒です
*/