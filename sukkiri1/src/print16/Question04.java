package print16;

import java.util.HashMap;
import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		HashMap<String, Integer> fruits = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		/*
		if (fruits.size() == 0) {
			System.out.println("fruitsの中身は空です");
		}*/
		if (fruits.isEmpty()) {
			System.out.println("fruitsの中身は空です");
		}else {
			System.out.println("fruitsの中身は空ではないです");
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print("(りんご ３個)入力値：");
			String putFruit = sc.nextLine();//りんご　３個
			String[] splitFruit = putFruit.split("\\s");//配列[0]と[1]に分ける" "
			String num = splitFruit[1].replace("個", "");//[1]の個を消す
			Integer numInt = Integer.parseInt(num);//[1]のnumをInteger型にする
			fruits.put(splitFruit[0], numInt);
		}
		for (String key : fruits.keySet()) {
			System.out.println("果物名: "+key + "個数:" + fruits.get(key));
		}
		
		System.out.println("fruitsの要素数: "+fruits.size());
		
		fruits.remove("みかん");
		for (String key : fruits.keySet()) {
			System.out.println("果物名: "+key + "個数:" + fruits.get(key));
		}
		sc.close();
	}
}

/*
4 【Mapの基本操作】
1.
keyがString型、ValueがInteger型のHashMapを変数名fruitsで宣言してください。keyには果物名、Valueには個数が入ります。
2.
if文を使い、fruitsが空の時は「fruitsの中身は空です」と表示し、空ではないときは「fruitsの中身はあります」と表示する条件文を作成してください
3.
for文を使い3回ループするように作ってください
キーボードから順番に以下の内容を入力する。
ループ1周目：りんご 3個
ループ2周目：みかん 10個
ループ3週目：梨 2個
それぞれの入力値をfruitsのkeyとvalueになるように、入力値を加工してfruitsに追加してください。
※文字列の分割、文字の取り除き、型変換を行う必要がある
4. 拡張for文を使い、「果物名：key 個数:Value」となるように表示してください。
5. fruitsの要素数を表示してください。
6. 「みかん」のものだけfruitsの要素から削除してください。
7. 拡張for文を使い再度表示してください。*/