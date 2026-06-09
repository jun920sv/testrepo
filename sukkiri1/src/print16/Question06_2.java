package print16;

import java.util.HashMap;
import java.util.Map;

public class Question06_2 {

	public static void main(String[] args) {
		String story = """
				昔々、ある所にお爺さんとお婆さんがいました。
				お爺さんは山へ芝刈りにお婆さんは川へ洗濯に行きました。
				お婆さんが川で洗濯をしていると大きな桃が流れてきました。
				""";
		String[] words = story.replaceAll("\\s", "").split("[にへとがはでを。、]");
		Map<String, Integer> map = new HashMap<String, Integer>();
		int max = 1;
		for (String w : words) {
			if (map.containsKey(w)) {
				int value = map.get(w);
				value++;
				max = Math.max(value, max);
				map.put(w, value);
			} else {
				map.put(w, 1);
			}
		}

		for (int i = max; i > 0; i--) {
			for (String key : map.keySet()) {
				if (map.get(key) == i) {
					System.out.printf("%s:%d\n", key, i);
				}
			}
		}
	}

}

