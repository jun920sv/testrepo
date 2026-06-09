package sample;

import java.util.Scanner;

class Hantei {
	String a = null;
	int b ;

	Hantei() {
		Scanner sc = new Scanner(System.in);
		System.out.println("文字を入力");
		this.a = sc.nextLine();
		System.out.println("数字を入力");
		this.b = sc.nextInt();

	}

	boolean ABC() {
		if(a.equals("ABC")) {
			return true;
		}else {
			return false;
		}
	}
	String Gusu() {
		if (b % 2 == 0) {
			return "偶数";
		} else {
			return "奇数";
		}
	}
}


public class Sample01 {
	public static void main(String[] args) {
		Hantei h = new Hantei();
		boolean h1 = h.ABC();
		System.out.println(h1);

		String h2 = h.Gusu();
		System.out.println(h2);

		//System.out.println(h);
	}

}
/*
①
キーボードから文字列を入力し、入力された値がABCの場合はtrueを、
異なる場合はfalseをboolean型変数bに代入してください。
その後、変数bの値を表示してください。
②
キーボードから数値を入力し、入力された値が奇数か偶数か表示してください。
*/