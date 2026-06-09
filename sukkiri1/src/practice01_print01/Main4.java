package practice01_print01;

public class Main4 {
	public static void main(String[] args) {

		String a = "計算します";
		int b = 1;
		int c = 2;
		int d = 3;
		int e = 10;
		
		
		IO.println(a + "\n" + e + "-" + c + "=?\n" + (e - c));
		IO.println(a + "\n" + c + "×" + d + "=?\n" + (c * d));
		IO.println(a + "\n" + b + "+" + c + "+" + d + "=?\n" + (b + c + d));

	}
}
