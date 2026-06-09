package dokkai16;

import java.util.HashSet;

public class Main2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(null);
		System.out.println(set.size());
	}
}
