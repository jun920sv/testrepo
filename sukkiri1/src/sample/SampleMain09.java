package sample;

import java.util.Scanner;

class Seiseki {
	int test;

	Seiseki() {
		Scanner sc = new Scanner(System.in);
		System.out.println("点数を入力してください");
		test = sc.nextInt();

	}

	String Seisekichck() {

		if (test > 100) {
			return "嘘";

		} else if (test == 100) {
			return "満点";

		} else if (test >= 90) {
			return "優秀";
		} else if (90 > test && test >= 80) {
			return "良好";
		} else if (80 > test && test >= 70) {
			return "可";

		} else {
			return "不可";

		}
	}

}

public class SampleMain09 {
	public static void main(String[] args) {

		Seiseki hensumei = new Seiseki();
		String s = hensumei.Seisekichck();
		System.out.println(s);

	}

}

/*
以下のプログラムを作成してください。【論理演算子】
テストの成績をキーボードから入力し、90点以上であれば「優秀」、
80点以上90点未満であれば「良好」、
70点以上80点未満であれば「普通」、60点以上70点未満であれば「可」、
60点未満であれば「不可」と表示するプログラムを作成してください*/