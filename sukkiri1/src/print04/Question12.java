package print04;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
//二分探索　
		Scanner sc = new Scanner(System.in);
		int[] ary = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };//ソート済みの配列 
		System.out.println("探したい値を入力");
		int key = sc.nextInt();//探したい値を入力
		
		int left = 0; //探索範囲の左端 
		int right = ary.length - 1; //探索範囲の右端
		int mid = -1; //中央のインデックス（初期値はなんでも良い）

		boolean bool = false; //探索値が存在したかのフラグ 
		while (left<=right ) { //左と右が同じ場合も探す　探索範囲が残っている間は実行 
			mid = (left + right)/2 ; //中央のインデックスを求める 
			if (ary[mid] == key) { //探したい値が見つかったとき
				bool = true;
				break;
			} else if (ary[mid] < key) { //中央より右のとき 
				left =mid+1; //左端を中央のインデックス+1にする

			} else {
				right =mid-1;//右端を中央のインデックス-1にする 
			}
		}
		if (bool) {
			System.out.println("インデックス番号：" + mid);
		} else {
			System.out.println("該当なし");
		}
		sc.close();
	}
}
