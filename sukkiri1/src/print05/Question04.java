package print05;

public class Question04 {
	public static void main(String[] args) {
		int a = 30;
		int b = 20;

		add(a, b);
		sub(a, b);
		mul(a, b);
		waru(a,b);
		System.out.print("余り"+amari(a,b));
		

	}

	public static void add(int a, int b) {
		int tasizan = a + b;
		display(a, b, '+', tasizan);
	}

	static void sub(int a, int b) {
		int hikizan = a - b;
		display(a, b, '-', hikizan);
	}

	static void mul(int a, int b) {
		int kakezan = a * b;
		display(a, b, '*', kakezan);
	}

	static void waru(int a, int b) {
		int warizan = a / b;
		display2(a, b, '/', warizan);
	}
	static int amari(int a, int b) {
		int amari = a % b;
		return amari;
	}
	
	
	static void display(int a, int b, char c, int result) {
		System.out.println(a + Character.toString(c) + b + "=" + result);
	}
	static void display2(int a, int b, char c, int result) {
		System.out.print(a + Character.toString(c) + b + "=" + result);
	}

}

//addメソッドを呼ぶ 
//subメソッドを呼ぶ 
//mulメソッドを呼ぶ 

/* * メソッド名：add 
* * 引数：int a , int b 
* * 戻り値：なし 
* * 処理：引数aと引数bを足し算する
*  * displayメソッドを呼ぶ 
*  */
/* * メソッド名：sub 
 * * 引数：int a , int b 
 * * 戻り値：なし * 処理：引数aと引数bを引き算する 
 * * displayメソッドを呼ぶ 
 * */
/* * メソッド名：mul 
 * * 引数：int a , int b 
 * * 戻り値：なし 
 * * 処理：引数aと引数bを掛け算する 
 * * displayメソッドを呼ぶ 
 * */
/* * 
 * * メソッド名：display 
 * * 引数：int a , int b , char c , int result 
 * * 戻り値：なし * 処理： a + b = result , a - b = result の形で表示する 
 * * 足し算の場合：30+20=50と表示 
 * * 引き算の場合：30-20=10と表示 
 * * 掛け算の場合：30*20=600と表示 
 * * 変数cは、Character.toString(c)として型変換が必要。 
 * */
