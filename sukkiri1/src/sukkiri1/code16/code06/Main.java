package sukkiri1.code16.code06;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		Map<String, Integer>prefs = new HashMap<String, Integer>();
		prefs.put("京都府",255);
		prefs.put("東京都",1261);
		prefs.put("熊本県",181);

		int tokyo=prefs.get("東京都");
		System.out.printf("東京都の人口は、%d\n",tokyo);
	
	prefs.remove("京都府");
	System.out.println(prefs.get("京都府"));
	
	prefs.put("熊本県", 1822);//上書き
	int kumamoto = prefs.get("熊本県");
	System.out.printf("熊本県の人口は、%D\n",kumamoto);
	
	
	
	
	
	}
}
