package print03;

import java.util.Scanner;

class E {

	void a() {
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力:");
		int n =sc.nextInt();
		int sum =1;
		for(int i=1; i<=n;i++) {
			sum=sum*i;
			//1 2 6 24 120 5の場合
		}
		System.out.println(sum);
		sc.close();
	}

}

public class Question07 {
	public static void main(String[] args) {
		
		E c = new E();
		c.a();
	}
}
