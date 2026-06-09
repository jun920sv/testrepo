package sukkiri1.code03.code09;

public class Main {

	public static void main(String[] args) {

		/*
		int i = 0;
		while (i < 10) { //こんちはが10回表示される
			System.out.println("こんにちは");
			i++;
			}
		*/

		//ループ変数の宣言　i =0;　慣習的にi を使う　なんでもいいけど]
		//次の変数はi,j,k,l,m,n ネストの時
		//繰り返し条件式　i<10; 前知判定
		//
		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
			for (int j = 0; j < 5; j++) {
				System.out.println("i=" + i + "j=" + j);
				for (int k = 0; k < 5; k++) {
					System.out.println("i=" + i + "j=" + j + "k=" + k);
				}
			}

		}

	}
}
