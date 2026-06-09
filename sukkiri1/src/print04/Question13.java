package print04;

import java.util.Random;

public class Question13 {
	public static void main(String[] args) {
		
		int[] ary = new int[5];
		Random rand = new Random();

		for (int i = 0; i < ary.length; i++) {
			int r = rand.nextInt(100);
			ary[i] = r;
			System.out.print(ary[i] + " ");
		}
		System.out.println();
		
		int[] newAry = new int[10];
		for (int i = 0; i < ary.length; i++) {
			newAry[i]+=ary[i];
			System.out.print(newAry[i] + " ");
		}
		for (int i = ary.length; i < newAry.length; i++) {
			int r = rand.nextInt(100);
			newAry[i] = r;
			System.out.print(newAry[i] + " ");
		}
		
		System.out.println();//確認用　
		for (int i = 0; i < newAry.length; i++) {
		System.out.print(newAry[i]+" ");
		
		}
		
	}

}
