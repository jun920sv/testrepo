package print04;

public class Question05_2 {
	public static void main(String[] args) {
		int index = 0;

		String[] names = { "Bob", "John", "Alice", "Carol", "Charlie" };
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Alice")) {
				index = i;
				break;
			}

		}
		if (index != -1) {
			System.out.println(index + "番目にAliceがあります");
		} else {
			System.out.println("Aliceがありませんでした");
		}

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Carol")) {
				names[i] = "Ellen";

			}
		}
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}

	}

}
