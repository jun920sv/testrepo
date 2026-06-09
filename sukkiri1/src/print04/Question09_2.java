package print04;

import java.util.Scanner;

public class Question09_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mulTable = new int[9][9];
		System.out.println("整数値を入力：");
		int num = sc.nextInt();
		boolean judgment = false;
		int count = 0;

		for (int i = 0; i < mulTable.length; i++) {
			for (int j = 0; j < mulTable[i].length; j++) {
				mulTable[i][j] = (i + 1) * (j + 1);
				if (mulTable[i][j] < 10) {
					//	System.out.print(" ");

				}
				//System.out.print(mulTable[i][j]+" ");//9*9表示用
				if (num == mulTable[i][j]) {
					System.out.println((i + 1) + "*" + (j + 1));
					count++;
					judgment = true;

				}

			}
			//System.out.println();	
		}
		
		if (count!=0) {
			System.out.println(count+"件見つかりました");
		}else {
			System.out.println("入力値が九九の表には存在しません");
		}
		
		sc.close();
	}

}
