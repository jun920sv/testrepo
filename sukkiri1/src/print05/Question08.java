package print05;

import java.util.Scanner;

public class Question08 {
	static int inNumber;
	static String msg = "";
	static int input;

	public static void main(String[] args) {

		do {
			input = inputNumber();
			numberToMessage(input);
			showMessage(msg);

		} while (input != 0);

	}

	static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数を1～3で入力 0で終了: ");
		return inNumber = sc.nextInt();

	}

	static String numberToMessage(int a) {
		switch (inNumber) {
		case 0:
			msg = "終了！";
			break;
		case 1:
			msg = "Good Morning";
			break;
		case 2:
			msg = "Good Afternoon";
			break;
		case 3:
			msg = "Good Evening";
			break;
		default:
			msg = "1～3でいれてね";
		}
		return msg;
	}

	static void showMessage(String mag) {
		System.out.println(msg);
	}

}
