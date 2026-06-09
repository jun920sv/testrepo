package dokkai15;

public class Main3 {
	public static void main(String[] args) {
		String s = "banana";//bonono
		System.out.println(s.replace("a", "o"));

		String s1 = " Hello Java Programming ";
		String s2 = s1.trim().toLowerCase().replaceAll(" ", "-").concat(".txt");
		System.out.println(s2);
		
		
		
		System.out.println(s1);//変わらない

	}
}
