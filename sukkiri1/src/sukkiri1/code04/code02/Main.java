package sukkiri1.code04.code02;

public class Main {
	public static void main(String[] args) {
		int[] scores;//int型の　配列指定
		scores = new int[5]; 
		scores[1] = 30;
		System.out.println(scores[1]);
		System.out.println(scores[0]);
		System.out.println(scores[2]);
		int x=4;
		scores[4] = x;		
		System.out.println(scores[4]);
		
		int[] a = new int[5];
		System.out.println("int型の初期値"+a[1]);
		
		boolean[] b = new boolean[5];
		System.out.println("boolean型の初期値"+b[0]);

		String[]s = new String[5];
		System.out.println("String型の初期値"+s[0]);
		
		char[]c=new char[5];
		System.out.println(c[0]);
		
		int []scores1 = new int[] {20,30,40,50,60};//メインの書き方
		int []scores2 = {20,30,40,50,60};//省略記号
		
		int []scores3;
//		scores3= {20,30};//左辺に型があるときのみできるエラー
		scores3 = new int [] {20,30};
		System.out.println(scores3[1]);
	}

}
