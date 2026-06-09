package dokkai16;

import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("tanaka", "suzuki", "sato");
		printNames(names);
	}

	static void printNames(List<String> list) {
		for (String n : list) {
			String result = n.substring(0, 1).toUpperCase() + n.substring(1);
			System.out.println(result);
		}
	}
}
