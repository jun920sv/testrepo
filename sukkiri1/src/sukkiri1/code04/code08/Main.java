package sukkiri1.code04.code08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int seq[] = new int[10];
		Random rand = new Random();

		//塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = rand.nextInt(4);
		}

		//生成した塩基配列の記号を表示
		char[] base = {'A','T','G','C'};
		for (int i= 0; i<seq.length;i++) {
			System.out.print(base[seq[i]]+" ");
		//処理の分解
			int baseType = seq[i];
			char baseChar = base[baseType];
			System.out.println(baseChar + " ");
		
		
		
		}
	
		
/*
		for (int j = 0; j < seq.length; j++) {
			switch (seq[j]) {
			case 0 -> {
				System.out.println("A ");
			}
			case 1 -> {
				System.out.println("T ");
			}
			case 2 -> {
				System.out.println("G ");
			}
			case 3 -> {
				System.out.println("C ");
			}
			}
			System.out.print(base[seq[j]]+" ");
			
		}

	}
*/
}
}

