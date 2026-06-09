package sample;

class Onigiri {
	int nedan = 120;
	int kosuu;
	// TODO 自動生成されたメソッド・スタブ
}

class Otya {
	int nedan = 150;
	int kosuu;

}

public class SampleMain06 {
	
	static void Show(Onigiri o1,Otya o2) {
		int total =(o1.nedan*o1.kosuu);
		System.out.println("おにぎりの合計は"+total+"円です");
		
		int total2 =(o2.nedan*o2.kosuu);
		System.out.println("お茶の合計は"+total2+"円です");
	}

	public static void main(String[] args) {
		
		Onigiri o1 = new Onigiri();
		Otya o2 = new Otya();

		o1.kosuu =3;
		o2.kosuu=4;
		
		Show(o1,o2);
		
		
		

	}

}/*
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