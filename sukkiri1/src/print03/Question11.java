package print03;

class I {

	static void a() {

		char c = 'a';
		while (c != 'z') {
			System.out.print(c);
			c++;
			
		}
		
		
		System.out.println('z');
	}

}

public class Question11 {
	public static void main(String[] args) {

		I.a();
	}

}
