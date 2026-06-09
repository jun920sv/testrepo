package print03;

class B {

	void a() {

		int count = 5;
		while (count >= 1) {
			System.out.println(count);
			count--;
		}
	}

	void b() {
		System.out.println("=====for文=====");
		int count = 5;
		for (count = 5; count >= 1; count--) {
			System.out.println(count);

		}
	}
}

public class Question03 {
	public static void main(String[] args) {
		B a = new B();
		a.a();
		a.b();

	}
}
