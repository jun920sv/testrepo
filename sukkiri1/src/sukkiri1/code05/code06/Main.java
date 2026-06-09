package sukkiri1.code05.code06;

public class Main {
	public static int add(int x, int y) { //この１行目が大切 int型 メソッドaddの定義
		int ans = x + y; //ans は変数名
		return ans;

	}

	public static void main(String[] args) {
	int answer =	add(100, 10); //answerも変数名 必要なのはaddの呼び出し
	System.out.println(answer);
	

	}

}
