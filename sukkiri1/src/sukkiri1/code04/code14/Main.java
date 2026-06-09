package sukkiri1.code04.code14;

public class Main {

	public static void main(String[] args) {
		String str = "javaで開発★";
		System.out.println(str.length());//Stringはlenght()がいる

		char[] charArr = str.toCharArray();//strをキャラクター型の配列で取り出す
		
		for(char c : charArr) {
			System.out.print(c);
		}
		System.out.println(charArr);
		
	}

}
