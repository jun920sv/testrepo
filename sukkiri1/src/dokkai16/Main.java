package dokkai16;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add(1, "C");
		System.out.println(list);
	}
}
