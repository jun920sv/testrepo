package practice02_print01;

import java.util.Random;

public class Main10 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int oni = 3+random.nextInt(8);
		int otya =1+random.nextInt(3);		
		double goukei = ((oni*120) + (otya*150))*1.1;
		
		System.out.println("おにぎり"+oni+" 個購入");
		System.out.println("お茶"+otya+" 本購入");
		System.out.println("税込み"+(int)goukei+("円です"));
		
		
		
		final int ONIGIRI =120;
		final int GREEN_TEA =150;
		final double TAX =0.1;
		
		final int M = random.nextInt(8+1-3);
		final int N = random.nextInt(3+1-1);
		
		System.out.println("おにぎり"+M+" 個購入");
		System.out.println("お茶"+N+" 本購入");
		int sum = ONIGIRI * M + GREEN_TEA *N;
		double includingTAX = sum*(1+TAX);
		System.out.println("税込み"+Math.round(includingTAX)+("円です"));
		
		
	}

}
/*
以下の文章を読んでプログラムを作成してください
おにぎり1 個１２０円をＭ個、お茶１本１５０円をＮ本購入します。
消費税は合計金額に対して１０％かかります。
税込みでの金額を表示してください。
購入数ＭとＮについてはランダムな値を使用します。
Ｍの範囲は３～１０、Ｎの範囲は１～３とします。
実行結果例
おにぎり8 個購入
お茶3 本購入
税込み1551 円です
*/