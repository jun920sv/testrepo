package print12.Question02;

public class Main {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		int c = 0;
		int d = -5;
		//a + b の結果を表示
		System.out.println("Add: "+CustomMath.add(a, b));
		//a - b の結果を表示
		System.out.println("Subtract: "+CustomMath.subtract(a, b));
		//a * b の結果を表示
		System.out.println("Multiply: "+CustomMath.multiply(a, b));
		//a / c の結果を表示
		System.out.println("Divide: "+CustomMath.divide(a, c));
		//a / b の結果を表示
		System.out.println("Divide: "+CustomMath.divide(a, b));
		// d の絶対値を表示
		System.out.println("Absolute: "+CustomMath.abs(d));
	
	}
}
