package sukkiri1.code03.code04;

public class Main {

	public static void main(String[] args) {

		int a = 11;
		String msg = "メッセージ";
		if (10 > a && a > 0 && msg.equals("メッセージ")) {
			System.out.println("〇");
		} else {
			System.out.println("×");
		}

		int age = 20;
		if (!(age == 10)) {
			System.out.println("〇");

		} else {
			System.out.println("×");
		}
		if (a != 0 && 10 / a != 100) {
			System.out.println("〇");

		}

	}

}

//&& かつ　||または
//	if(10>a>0); (10>a を先処理するので　>0 と比べられないエラー)