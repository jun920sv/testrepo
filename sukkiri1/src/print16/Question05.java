package print16;

import java.util.HashSet;
import java.util.Random;

public class Question05 {
	public static void main(String[] args) {
		HashSet<Integer>bingo = new HashSet<Integer>();
		Random rand = new Random();
		while(true) {
			int num = rand.nextInt(99)+1;
			bingo.add(num);
			if(bingo.size()==25) {
				break;
			}
		}
		int count =0;
		for(Integer b :bingo) {
			count++;
			if(count ==13) {
				System.out.printf("%2s ","★");
			}else {
				System.out.printf("%3d ",b);
			}
			if(count % 5 ==0) {
				System.out.println();
			}
		}
		

	}
}

/*
【HashSet】 ビンゴカードを作成してください。
条件：
1.
HashSetはInteger型
2.
while文は無限ループ
3.
乱数範囲は１～９９
4.
HashSetに必要なデータ数が集まったらwhile文を抜ける。
5.
拡張for文を使って実行結果例のように表示する。
※printfを使うこと*/



