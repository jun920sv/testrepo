package print04;

import java.util.Arrays;

public class Question07_2 {
	public static void main(String[] args) {

		int[] scores = { 50, 95, 80, 70, 85 };
		int[] ransks = { 1, 4, 2, 3, 0 };//indexのこと
		int[] a = new int[5];

		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "番:" + scores[i] + "点");
		}
		System.out.println();
		for(int i = 0; i < ransks.length; i++) {
			System.out.println((i + 1) + "位:" + scores[ransks[i]] + "点");
			
		}
		for (int i = 0; i < scores.length; i++) {
		int index = ransks[i];
		System.out.println(ransks[i]);
		}
		
		Arrays.sort(scores);             
		System.out.println(Arrays.toString(scores)); 
	
	}
}
