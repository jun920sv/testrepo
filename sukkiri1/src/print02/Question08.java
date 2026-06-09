package print02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("受験番号を入力：");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1105,1200,1311: //まとめられる
			System.out.println(num + "番は合格です");
		break;
		/*
		case 1200:
		System.out.println(num + "番は合格です");
		break;
		
		case 1311:
		System.out.println(num+"番は合格です");
		break;
		*/
		default:
		System.out.println(num+"番は不合格です");
		}
		sc.close();
	}
}

