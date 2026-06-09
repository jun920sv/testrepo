package print04;

import java.util.Random;

public class Question13_2 {
	public static void main(String[] args) {

		int[] array = new int[5];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int r = rand.nextInt(100);
			array[i] = r;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//メソッドを使う
		// printArray(array)

		int[] newAry = new int[10];
		for (int i = 0; i < array.length; i++) {
			if (i < array.length) {
				newAry[i] = array[i];
			} else {
				newAry[i] = rand.nextInt(100);
			}

		}printArray(array);
	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
