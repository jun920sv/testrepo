package sukkiri1.code02.column;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a =10;
		int b =10;
		System.out.println(++a+50 );//中身を増やしてから評価
		System.out.println(b++ );//中身を評価してから増やす
		System.out.println(b );//なのでこっちは１１
		
		//推奨の書き方は　単独で使う
		++a;
		System.out.println(a);
		
		
		byte b1 =3;
		byte b2 =5;
		byte b3 =(byte)(b1+b2);
		
		System.out.println(b3);
		
		
	}

}
