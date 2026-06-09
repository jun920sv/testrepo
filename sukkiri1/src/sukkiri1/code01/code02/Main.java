package sukkiri1.code01.code02;

public class Main {

	public static void main(String[] args) {
		int age; //int=整数専用の箱 age=その名前決め　
		age = 30;//ageに30を代入　この処理がないとエラーになる
		double weight;
		weight = 55.5;
		System.out.println(age);//出力		
		System.out.println(weight);

		float weight2 = 67.1F; //　このように直接代入までする
		System.out.println(weight2);

		String name = "minato";
		System.out.println(name);

		char zodiac = '辰';//zodiac=干支　char一文字だけ必ず
		IO.println(zodiac);
		
		double pi = Math.PI;
		IO.println(pi);

		age = 10;
		IO.print(age);

		byte b = 40;
		IO.print(b);
		
		long c = 70_000_000_000L; //入らない数値　は　後ろにLをつける
		IO.println(c);

		boolean isError;
		isError = true;//小文字じゃないとダメ
		isError = false;
		IO.println(isError);

	}

}
