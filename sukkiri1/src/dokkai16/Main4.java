package dokkai16;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		for (String s : list) {
			if (s.length() >= 6) {
				System.out.println(s.toUpperCase());
			} else {
				System.out.println(s);
			}
		}
	}
}
