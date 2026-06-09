package print05;

class Print{
	int i=5;
	void printHello(){
		System.out.println("Hello");
	}
	
}

public class Question01 {
	
	private static int i;


	static void ohayo() {
		System.out.println("おはよ");
	}
	
	
	public static void main(String[] args) {
		
		Print p = new Print();
		p.printHello();
		//printHelloメソッドを呼び出す
		
		 System.out.println(new Print().i);
		
		 ohayo();
		 Question01.ohayo();
		 Question01 Q = new Question01();
		 Q.ohayo();//非推奨　static だからインスタンス作成

	}

}
/* * メソッド名：printHello 
 * * 引数：なし 戻り値：なし 
 * * 処理：Hello という文字を出力 
 * */
 