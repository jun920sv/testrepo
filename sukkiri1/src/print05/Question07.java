package print05;

import java.util.Random;

public class Question07 {
	public static void main(String[] args) {

		int a = 100;
		int b = 25;
		double d = 3.14;
		double e = 1.41;
		char[] c = { '+', '-', '*', '/', '?' }; //演算子用の配列 

		//乱数を用いて配列cの中から１つ算術演算子を取得 

		Random rand = new Random();
		int ran = rand.nextInt(c.length);
		char c1 = c[ran];//
		int ranran = rand.nextInt(c.length);
		char c2 = c[ranran];
		//char c1 = c[rand.nextInt(c.length)];//こっちでもいい
		
		//calcメソッドを呼ぶ 引数a , c1 , b 

		int ans1 = calc(a, c1, b);

		//calcメソッドを呼ぶ 引数d , c2 , e 

		double ans2 = calc(d, c2, e);

		//表示 

		if (ans1 != -1) {
			System.out.println(a + Character.toString(c1) + b + "=" + ans1);

		} else {
			System.out.println("存在しない演算子です");
		}

		if (ans2 != -1) {
			System.out.println(d + Character.toString(c2) + e + "=" + ans2);

		} else {
			System.out.println("存在しない演算子です");
		}

	}

	static int calc(int a, char b, int c) {
	//return calc(a,b,c);//無限ループになる　こっちのほうが型が近いから
		return (int) calc((double) a, b, (double) c);
		//型を下のに合わせてる　けど戻り値intだから　int キャスト
	}

	
	static double calc(double a, char b, double c) {
		double result =-1;
	//呼び出されたとき必ずどこを通ってもreturn できるようにしないといけない
		
		switch (b) {
		case '+' -> {
			return add(a, c); //こっちか result に入れていってreturn するか
		}
		case '-' -> {
			result = sub(a, c);
		}
		case '*' -> {
			result = mul(a, c);
		}
		case '/' -> {
			result = div(a, c);
		}

		default -> {
			return result;
		}
		}
		return result;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double sub(double a, double b) {
		return (a - b);
	}

	static double mul(double a, double b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

}

/* * メソッド名：calc 
 * * 引数：int型、char型、int型 
 * * 戻り値：int型 
 * * 処理：多重定義をしているcalcメソッドに引数を渡す。 */

/* * メソッド名：calc   
 * * 引数：double型、char型、double型 
 * * 戻り値：double型 
 * * 処理：char型引数の値を見て、add,sub,mul,divの各メソッドの処理を呼び出す。 
 * * switch文を使い、「+」「-」「*」「/」で対応したメソッドを呼ぶ。 
 * * 各メソッドの戻り値を、そのまま戻り値として呼び出し元に返す。 
 * * ただし、4種類の文字以外のときは-1を戻り値として返す。 */

/* * メソッド名：add 
 * * 引数：double a , double b 
 * * 戻り値：double 
 * * 処理：引数aと引数bを足し算して戻り値として返す */

/* * メソッド名：sub 
 * * 引数：double a , double b 
 * * 戻り値：double 
 * * 処理：引数aと引数bを引き算して戻り値として返す */

/* * メソッド名：mul 
 * * 引数：double a , double b 
 * * 戻り値：double 
 * * 処理：引数aと引数bを掛け算して戻り値として返す */

/* * メソッド名：div 
 * * 引数：double a , double b 
 * * 戻り値：double 
 * * 処理：引数aと引数bを割り算して戻り値として返す */
