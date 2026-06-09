package print14.Question04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("現在の時刻は？");
		int hour = sc.nextInt();
		//インターフェースのstaticメソッドを呼ぶ
		

		Greet g = Greet.createInstance(hour);
		
		//挨拶メソッドを呼ぶ
		g.greeting();
		
	}
}

