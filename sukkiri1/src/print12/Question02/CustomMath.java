package print12.Question02;

final  class CustomMath {
	//継承を禁止にする

	private CustomMath() {//他のクラスから隠蔽される

	}
	//インスタンスの生成をさせないためのコンストラクタ

	static int add(int a, int b) {
		return a + b;

	}
	/*
	 * 静的メソッド：addメソッド
	 * 引数：int a , int b
	 * 戻り値：int型
	 * 処理：足し算結果を返す
	 */

	static int subtract(int a, int b) {
		return a - b;
	}
	/*
	 * 静的メソッド：subtractメソッド
	 * 引数：int a , int b
	 * 戻り値：int型
	 * 処理：引き算結果を返す
	 */

	static int multiply(int a, int b) {
		return a * b;
	}

	/*
	 * 静的メソッド：multiplyメソッド
	 * 引数：int a , int b
	 * 戻り値：int型
	 * 処理：掛け算結果を返す
	 */

	static double divide(int a, int b) {
		if (b == 0) {
			System.out.println("0では割れません");
			return 0;
		} else {
			return a / b;
		}

	}
	/*
	 * 静的メソッド：divideメソッド
	 * 引数：int a , int b
	 * 戻り値：double型
	 * 処理：割り算結果を返す
	 * 　　　bが0のときは、「0では割れません」を表示後、０を返す。
	 */

	static int abs(int a) {
		return a < 0 ? a * -1 : a;

	}
	/*
	 * 静的メソッド：absメソッド
	 * 引数：int a
	 * 戻り値：int型
	 * 処理：三項演算子を用いて、aが負の値のときはマイナスを掛けて正にする。
	 * aが正の値のときはそのままaを返す
	 */

}
