package print04;

public class Question02 {

	public static void main(String[] args) {
		String[] names = { "Alice", "Bob", "Carol", "Dave", "John" };
		int[] age = { 20, 21, 22, 19, 18 };
		System.out.println("====for文を使わない====");
		System.out.println(names[0] + "さんは" + age[0] + "です");
		System.out.println(names[1] + "さんは" + age[1] + "です");
		System.out.println(names[2] + "さんは" + age[2] + "です");
		System.out.println(names[3] + "さんは" + age[3] + "です");
		System.out.println(names[4] + "さんは" + age[4] + "です");

		System.out.println("====for文を使う====");

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+"さんは"+age[i]+"です");
		}
			

	}

}
