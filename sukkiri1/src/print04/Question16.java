package print04;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) { //配列の宣言 
		int[] ary = { 5, 8, 2, 4, 1, 3, 10 };
		String[] strArray = { "John", "Bob", "Alice", "Carol", "Oscar" };
		//入力
		Scanner sc = new Scanner(System.in);
		System.out.println("調べたい数値を入力してください");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("調べたい名前を入力してください");
		String name = sc.nextLine();
		//昇順ソート Arrays.sort(ary); 
		Arrays.sort(strArray);
		//ソート後の配列をベースに二分探索を利用して入力値を探索 
		int resultNum = Arrays.binarySearch(ary, num);
		int resultName = Arrays.binarySearch(strArray, name);
		//結果表示

		if (resultNum >= 0) {
			System.out.println(resultNum + "番目に" + num + "はあります");
		} else {
			System.out.println("その値は存在しません");
		}
		if (resultName >= 0) {
			System.out.println(resultName + "番目に" + name + "はあります");
		} else {
			System.out.println("その値は存在しません");
		}
	}
}
