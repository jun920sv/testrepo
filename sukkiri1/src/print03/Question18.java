package print03;

import java.util.Scanner;

class N {
	static void a() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nを入力:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
			/*	if (i % 2 != 0 && j % 2 != 0) {
					System.out.print("☆");
				} else if (i % 2 != 0 && j % 2 == 0) {
					System.out.print("★");
				} else if(i % 2 == 0 && j % 2 != 0){
					System.out.print("★");
				} else if(i % 2 == 0 && j % 2 == 0){
					System.out.print("☆");
*/
				//足し算に注目した回答
				if((i+j)%2==0) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}

			}
			System.out.println("");

		}
	}

}

public class Question18 {
	public static void main(String[] args) {
		N.a();

	}

}
