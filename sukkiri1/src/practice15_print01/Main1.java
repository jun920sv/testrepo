package practice15_print01;

public class Main1 {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<=100; i++) {
			sb.append(i).append(',');
		}
		String s = sb.toString();
		System.out.println(s);
		
		
		
		String a [] = s.split(",");//カンマで分割する
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

}

