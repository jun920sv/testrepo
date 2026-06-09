package sukkiri1.code05.code08;

public class Main {

	public static int add(int x,int y) {
		System.out.println("メソッド１");
		return x+y;//計算結果を戻すaddメソッド
	}
	
	public static double add(double x,double y) {
		System.out.println("メソッド2");

		return x+y;//計算結果を戻すaddメソッド
	}
	public static String add(String x,String y) {
		System.out.println("メソッド3");
		return x+y;//計算結果を戻すaddメソッド
	}
	public static int add(int x,int y,int z) {
		System.out.println("メソッド4");
		return x+y+z;//呼び出されてない
	}
	
	
	public static void main(String[] args) {
		System.out.println(add(10,20));//オーバーロード
		System.out.println(add(3.5,2.7));//型一致を探し出してくれる
		System.out.println(add("Hello","World"));
		//型と数と順番違ったら別のメソッドとして区別できる

	}

}
