package print05;

import java.util.Arrays;
import java.util.Random;

public class Question06 {

	public static void main(String[] args) {
		int n = 10;

		//createArrayを呼ぶ 
		int[] hairetu = createArray(n);
		//System.out.println(Arrays.toString(hairetu));//確認用
		
		//getMinValueを呼ぶ 
		int min =getMinValue(hairetu);
		//System.out.println(min);//確認用

		//outputを呼ぶ
		output(hairetu,min);

	}

	static int[] createArray(int n) {
		Random rand = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			int a = rand.nextInt(100);
			arr[i] = a;
		}
		return arr;
	}

	static int getMinValue(int[] ary) {
		int min = Integer.MAX_VALUE;
		for (int i : ary) {
			min = Math.min(min, i);
			//min = min >i?i:min;
		}
		return min;

	}
	static void output(int[]ary,int min) {
		outputArray(ary);
		outputMinValue(min);
	}
	
	static void  outputArray(int[]ary) {
		Arrays.sort(ary);
		for (int i : ary) {
			Arrays.sort(ary);
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void outputMinValue(int min) {
		System.out.println("最小値:"+min);
	}
}

/* * メソッド名：createArray 
 * * 引数：int n 
 * * 戻り値：int[] 
 * * 処理：引数の値を要素数とする配列を宣言する 
 * * 配列を回し、ランダムな値（0～99)をセットする 
 * * 配列を戻り値として返す 
 * */
/* * メソッド名：getMinValue 
 * * 引数：int[] ary 
 * * 戻り値：int 
 * * 処理：引数で受け取った配列の中から最小値を返す */
/* * メソッド名：output 
 * * 引数：int[] ary , int min 
 * * 戻り値：なし 
 * * 処理：outputArrayを呼ぶ 
 * * outputMinValueを呼ぶ */

/* * メソッド名：outputArray 
 * * 引数：int[] ary 
 * * 戻り値：なし 
 * * 処理：引数で受け取った配列を順番に表示する */
/* * メソッド名：outputMinValue 
 * * 引数：int min 
 * * 戻り値：なし 
 * * 処理：引数の値を表示「最小値： 」の形 
 * */
