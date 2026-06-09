package print04;

import java.util.Arrays;

public class Question15 {
	public static void main(String[] args) { 
		int[] ary = {5,8,2,4,1,3,10}; 
		String[] strArray = {"John","Bob","Alice","Carol","Oscar"}; 
		Arrays.sort(ary); 
		Arrays.sort(strArray); 
		System.out.println(Arrays.toString(ary)); 
		System.out.println(Arrays.toString(strArray)); }
}
