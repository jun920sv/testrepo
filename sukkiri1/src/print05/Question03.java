package print05;

public class Question03 {
	protected static int a = 20;
	protected static int b = 30;
	
	static int add(int a, int b) {
		return a + b;
	}

	static int getMax(int a, int b) {
		// a>b ? a:b; 三項条件式
		return Math.max(a, b);
	}

	static void message(String msg, int a) {
		System.out.println(msg + a);
	}

	public static void main(String[] args) {
		String[] msgs = { "addメソッドの結果：", "getMaxメソッドの結果：" };
		

		int c = add(a, b);
		message(msgs[0], c);
		// int d = getMax(a,b);
		message(msgs[1],getMax(a,b));//直接も書けるよ
		

	}

}
/* * メソッド名：add 
 * * 引数：int a , int b 
 * * 戻り値：int 
 * * 処理：引数aと引数bを足し算した結果を戻り値として返す 
 * */
/* * メソッド名：getMax 
 * * 引数：int a , int b 
 * * 戻り値:int 
 * * 処理：引数aと引数bのうち大きいほうの値を戻り値として返す 
 * */
/* * メソッド名：message 
 * * 引数：String msg , int a 
 * * 戻り値：なし 
 * * 処理：msgとaを文字列連結して内容を表示する 
 * */