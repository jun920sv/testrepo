package print03;

import java.util.Scanner;

class G {

	void a() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2つの値の最大公約数を求めます");
		System.out.println("aの値＞ｂの値になるように入力してください");
		System.out.println("aの値:");
		int a = sc.nextInt();
		System.out.println("bの値:");
		int b = sc.nextInt();
		int r; //余り
		
		for(;a%b!=0;) {
			r=a%b;
			a=b;
			a=b;
			b=r;
		/*	System.out.println("余り"+r);			
			System.out.println("整数a"+a);			
			System.out.println("整数b"+b);
			*/		
		}
		System.out.println("最大公約は"+b+"です");
		sc.close();
	}

}

public class Question09 {
	public static void main(String[] args) {
		G c = new G();
		c.a();

	}

}
