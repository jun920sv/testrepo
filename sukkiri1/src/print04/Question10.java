package print04;

import java.util.Random;

public class Question10 {
	public static void main(String[] args) {

		int[] ary = new int[10];
		Random rand = new Random();

		for (int i = 0; i < ary.length; i++) {
			ary[i] = rand.nextInt(100);

			System.out.print(ary[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < ary.length - 1; i++) {//こっちはー１しなくていい 
			for (int j = 0; j < ary.length - 1; j++) {//ｊ+1でindexoutするから　-1
				if (ary[j] > ary[j + 1]) {
					int c = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = c;
				}
			}
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
	}
}

/*
 for (int i = 1; i < ary.length - 1; i++) { 
			for (int j = 0; j < ary.length - i; j++) { 1から初めて
				if (ary[j] > ary[j + 1]) {
 *					
 *				int left =j;
 *				int right = j+1;
 *					if (ary[left] > ary[rright]) {
					int c = ary[left];
					ary[left] = ary[raight];
					ary[raight] = c;
				}
 */
