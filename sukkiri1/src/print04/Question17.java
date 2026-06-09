package print04;

import java.util.Arrays;

public class Question17 {

	public static void main(String[] args) { //配列の宣言 
		int[] array = { 5, 2, 9, 1, 3 }; //配列のコピー(要素数同じ) 
		int[] newArray = Arrays.copyOf(array, array.length);
		//コピーした配列の要素を表示 
		System.out.println(Arrays.toString(newArray));
		//配列の比較 
		System.out.println(Arrays.equals(array, newArray));
		//配列の書き換え 
		array[1] = 12;
		//再度配列の比較 
		System.out.println(Arrays.equals(array, newArray));
		//配列のコピーと要素サイズの変更
		int[] newArray2 = Arrays.copyOf(array, 10);
		//配列の表示

		System.out.println(Arrays.toString(newArray2));
	}

}
