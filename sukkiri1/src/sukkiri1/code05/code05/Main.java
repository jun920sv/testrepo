package sukkiri1.code05.code05;

public class Main {
	public static void main(String[] args) {
		
		int x =100;//実数のスコープ範囲外
		int y=10;
		// add(); //なのでコンパイルエラー 呼び出し先の xyがなにもないから
		add();

	}

	public static void add() {
		  int x = 1; //ローカル変数 独立性がある
		  int y=2; //メソッドごとにローカル変数　これがあれば動く↑
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	public static void add(int x, String y) {
		String ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}

