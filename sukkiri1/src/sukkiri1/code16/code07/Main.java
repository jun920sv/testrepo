package sukkiri1.code16.code07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.printf("%sの人口は、%d\n", key, value);
		}
		Set<String> a = prefs.keySet();

	}

}
