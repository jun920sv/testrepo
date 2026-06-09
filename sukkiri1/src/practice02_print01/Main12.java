package practice02_print01;

import java.util.Random;
import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("英語:");
		int a1 = sc.nextInt();
		System.out.print("国語:");
		int a2  = sc.nextInt();
		System.out.print("数学:");
		int a3 = sc.nextInt();
		System.out.print("社会:");
		int a4 = sc.nextInt();
		System.out.print("理科:");
		int a5 = sc.nextInt();

		int goukei1 = a1 + a2 + a3 +a4 + a5;
		double ave1 = goukei1/5;
		
		Random random = new Random();
		int b1 =random.nextInt(101);
		int b2 =random.nextInt(101);
		int b3 =random.nextInt(101);
		int b4 =random.nextInt(101);
		int b5 =random.nextInt(101);
		
		int goukei2 = b1 + b2 + b3 +b4 + b5;
		double ave2 = goukei2/5;
		
		System.out.println("A 君の５科目合計点："+goukei1+"点");
		System.out.println("A 君の平均点："+(int)ave1);
		
		System.out.println("B 君の５科目合計点："+goukei2+"点");
		System.out.println("B 君の平均点："+(int)ave2);
		
		
	
		
		int x = Math.abs(goukei1 - goukei2);
		System.out.println("A 君とB 君の点数差:"+x);
		
		sc.close();
	}

}
/*A 君とB 君は学校で５科目の試験を受けました。
A 君の科目ごとの点数は、英語a1 点、国語a2 点、
数学a3 点、社会a4 点、理科a5 点でした。
B 君の科目ごとの点数は、英語b1 点、国語b2 点、
数学b3 点、社会b4 点、理科b5 点でした。
A 君、B 君の５科目の合計点を求めた上で、５教科平均点を出してください。

その後、A 君とB 君の５科目合計の点数差を求めてください。
A 君の各科目の点数についてはキーボードから入力してください。
B 君の各科目の点数については０～１００点の範囲でランダムに点数を出してく
ださい。

点数差についてはA 君―B 君の形で行います。もし点数差がマイナスになった場
合はマイナスを取り除く形（絶対値）で表示してください。

表示形式は実行結果例の通りになります。
実行結果例
英語：30 //入力
国語：20 //入力
数学：40 //入力
社会：30 //入力
理科：50 //入力
A 君の５科目合計点：170 //表示
A 君の平均点：34 //表示
B 君の５科目合計点：213 //表示
B 君の平均点：42 //表示
A 君とB 君の点数差：43 //表示
*/