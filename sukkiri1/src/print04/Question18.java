package print04;

import java.util.Arrays;

public class Question18 {

	public static void main(String[] args) {
		//配列を要素５で宣言 
		int[] array = new int[5];
		//全ての要素を７にする 
		Arrays.fill(array, 7);
		//配列を表示する 
		System.out.println(Arrays.toString(array));
	}
}
