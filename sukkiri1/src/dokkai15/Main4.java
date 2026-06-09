package dokkai15;

public class Main4 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		boolean b1 = s1 == s2;
		boolean b2 = s1.equals(s2);

		System.out.println(b1);//オブジェクト1　と2は別　なのでfalse
		System.out.println(b2);//中身の値を参照しているのでtrue

		String s3 = "Hello";
		String s4 = "Hello";
		boolean b3 = s3 == s4;
		boolean b4 = s3.equals(s4);
		
		System.out.println(b3);
		System.out.println(b4);
	}
}
