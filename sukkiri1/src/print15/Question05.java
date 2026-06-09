package print15;

public class Question05 {

	public static void main(String[] args) {

		String name = "Bob,Alice,Carol,Charlie,John,Ivan";
		String[] n = name.split(",");//" ," で区切って配列に入れる

		for (String i : n) {
			System.out.println(i);
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i].equals("Carol")) {
				System.out.println(i);
			}

		}
	}

}
