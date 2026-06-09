package print05;

import java.util.Scanner;

public class Question05 {

	static boolean isPositive(int n) {
		if (n>0) {
			return true;
		}else{
			return false;
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("入力値：");
		int number = sc.nextInt();

		// isPositiveメソッドを呼び出し、結果を受け取る 
		if (isPositive(number)) {
			System.out.println(number + "は正の値です。");
		} else {
			System.out.println(number + "は0以下の値です。");
		}
		
		sc.close();
	}

}
/** * メソッド名：isPositive 
 * * 引数：int n 
 * * 戻り値：boolean 
 * * 処理：引数が0より大きければtrue、
 * そうでなければfalseを返す 
 * */
