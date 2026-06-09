package sukkiri1.code01.lesson02;

public class Main2 {
	public static void main(String[] args) {

		boolean isError = true; //真偽値型
		IO.print("①" + isError + "  ");

	//	boolean result = true;
	//	IO.print("①" + result + "  ");

		char kanji = '駆';
		System.out.print("②" + kanji + "  ");

		double pie = 3.14;
		System.out.print("③" + pie + "  ");

		long suji = 314159265853979L;
	//	long number = 314159265853979L;
		IO.println("④" + suji + "L" + "  ");

		int a = 15;
		String minato = "\"湊の攻撃！敵に" + a + "ポイントのダメージを与えた\"";
	//	String msg
		IO.println("⑤" + minato);
	}

}
