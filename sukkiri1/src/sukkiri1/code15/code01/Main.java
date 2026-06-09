package sukkiri1.code15.code01;

public class Main {
	public static void main(String[] args) {

		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {//大文字小文字を無視する
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");

		String s4 = "";
		if (s4.isEmpty()) {//空文字ならture null はエラー
			System.out.println("s4は空文字です");
		}
		String s5 = "1あA";
		if (s5.length() == 3) {//文字数が３ならture null はエラー
			System.out.println("s5は3文字です");
		}

		String s6 = ""; //空文字ならtrue を返す　
		System.out.println(s6.isBlank());

	}

}
