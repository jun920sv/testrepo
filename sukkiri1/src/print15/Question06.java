package print15;

public class Question06 {

	public static void main(String[] args) {

		String number = "abc123def456";
		String a = number.replaceAll("[a-z]", "0");//[a-zA-Z]大文字対応
		System.out.println(a);
		System.out.println(number.replaceAll("[a-z]", "0"));
	}

}
