package print02;

import java.util.Random;

class Test {
	int a;
	int b;
	int c;
	int d;
	int e;

	Test() {
		Random rand = new Random();
		this.a = rand.nextInt(101);
		this.b = rand.nextInt(101);
		this.c = rand.nextInt(101);
		this.d = rand.nextInt(101);
		this.e = rand.nextInt(101);

	}

	void kekka() {
		System.out.print("A君の成績  ");
		System.out.print(" 英語：" + a);
		System.out.print(" 国語：" + b);
		System.out.print(" 数学：" + c);
		System.out.print(" 社会：" + d);
		System.out.print(" 理科：" + e);
		
	}

	int gouhi() {
		int result = 0;
		if (a >= 60) {
			result++;
		}
		if (b >= 60) {
			result++;
		}
		if (c >= 60) {
			result++;
		}
		if (d >= 60) {
			result++;
		}
		if (e >= 60) {
			result++;
		}
		return result;
	}

}

public class Question14 {
	public static void main(String[] args) {

		Test t = new Test();
		t.kekka();// これだけで呼べる
		System.out.println();
		//int goukaku = t.gouhi();
		t.gouhi();
		System.out.println("合格した科目数"+t.gouhi()+"科目");

	}

}
