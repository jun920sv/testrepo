package dokkai16;

import java.util.Arrays;
import java.util.List;

public class Main7 {
	public static void main(String[] args) {
		List<String> orders = Arrays.asList("A-1200", "B-800", "C-1500");
		int total = 0;
		for (String o : orders) {
			total += parse(o);
		}
		System.out.println(total);
	}

	static int parse(String s) {
		String[] parts = s.split("-");
		int price = Integer.parseInt(parts[1]);
		if (price >= 1000) {
			return price * 2;
		}
		return price;
	}
}
