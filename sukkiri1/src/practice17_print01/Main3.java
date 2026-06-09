package practice17_print01;

public class Main3 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.err.println("漢字は使えません");//赤文字で出せる
		}
	}
}
