package sukkiri1.code05.code07;

public class Main {
	public static int add(int x, int y) { //この１行目が大切 int型 メソッドaddの定義
		int ans = x + y; //ans は変数名
		return ans;//return は実行結果確定 プログラム終了！
		//int z = 100; //到達不能コード
	}

	public static void main(String[] args) {
	System.out.println(add(add(10,20),add(30,40)));//かっこの内側から処理;
	

	}

}
