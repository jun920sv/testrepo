package print05;

public  class Question02 {
	
	static int  plusOne(int a){
		return a+1;
	}
	
	static void output(int c) {//好きな変数名
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		int a=10;
		int b= plusOne(a);//bに代入　
		output(b);//bを出力
		
	}

}
/* * メソッド名：plusOne 
 * * 引数：int a 
 * * 戻り値：int型 
 * * 処理：引数で受け取った数値を１足して、戻り値として返す 
 * */ 
/* * メソッド名：output 
 * * 引数：int a 
 * * 戻り値：なし 
 * * 処理：引数で受け取った数値を表示する。 
 * */

