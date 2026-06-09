package dokkai16;

import java.util.HashMap;

public class Main3 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(1, "Cherry");
		System.out.println(map.get(1) + ", size:" + map.size());
	}
}
