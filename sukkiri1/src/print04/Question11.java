package print04;

public class Question11 {
	public static void main(String[] args) {

		int[] fibonacci = new int[15];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] += fibonacci[i - 2] + fibonacci[i - 1];
		}

		for (int i : fibonacci) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("拡張for文↑");

		for (int i = 0; i < fibonacci.length; i++) {
			System.out.print(fibonacci[i] + " ");
		}
		System.out.println();
		
		for(int i :fibonacciArray(15)) {
			System.out.print(i + " ");
		}
		
	}

	public static int[] fibonacciArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = fibonacci(i);
		}
		return arr;
	}

	public static int fibonacci(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		return fibonacci(i-1)+fibonacci(i-2);
	}
	}

