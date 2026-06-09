package sukkiri1.code06.code01;

public class Calc {
	public static void main(String[] args) {
		
		int a =10;
		int b=2;
		int total=tasu(a,b);
		int delta=hiku(a,b);
		System.out.printf("足すと%d、引くと%d",total,delta);
	
	}

	

	private static int tasu(int a, int b) {
		return a+b;
	}
	
	public static int hiku(int a, int b) {
		return a-b;
	}

}
