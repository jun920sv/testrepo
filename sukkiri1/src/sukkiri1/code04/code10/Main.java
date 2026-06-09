package sukkiri1.code04.code10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*for(int i =0; i<10;i++) {
			int input = sc.nextInt();
			System.out.println(input);
		}
		*/
		int[] arr = new int[3];
		for(int i =0; i<3;i++) {
			arr[i] = sc.nextInt();
			
		}
		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.println(arr[i]);
		}
		
	}

}
