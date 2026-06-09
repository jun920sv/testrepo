package sample;

class A {
	static int s=10;

	static void method() {
		int sm = 2;
		System.out.println(sm);
	}
	A(){
		System.out.println(5);

	}
}

public class SampleMain10 {
	private static int b = 10;

	public static void main(String[] args) {
		
		int s = new A().s;
		
		A.s = 10;
		System.out.println(A.s);
		A.method();
		A a= new A();

	}

}
