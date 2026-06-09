package print14.Question01;

public class Main {

	public static void main(String[] args) {
		
		//MorningGreetをインスタンス化
		Greet g = new MorningGreet();
		//メソッドを呼ぶ
		g.greeeting();
		//EveningGreetをインスタンス化
		g = new EveningGreet();
		//メソッドを呼ぶ
		g.greeeting();			
	}

}

