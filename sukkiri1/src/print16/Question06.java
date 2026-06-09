package print16;

import java.util.HashMap;

public class Question06 {

	public static void main(String[] args) {
		String mukasibanasi = "昔々、ある所にお爺さんとお婆さんがいました。\n"
				+ "お爺さんは山へ芝刈りにお婆さんは川へ洗濯に行きました。\n"
				+ "お婆さんが川で洗濯をしていると大きな桃が流れてきました。";

		//String[] tango = mukasibanasi.split("に|へ|と|が|は|で|を|。|、");
		String[] tango = mukasibanasi.replaceAll("\\s","").split("[に|へ|と|が|は|で|を|。|、]");
	
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int max=1;
		for (String key: tango) {
			key=key.trim();
			if (map.containsKey(key)) {//P602 指定データがキーに含まれているか判定
				int value = map.get(key);
				value++;
				max = Math.max(value, max);
				map.put(key,map.get(key)+1);
			} else {
				map.put(key ,1);
			}
		}
	/*	for(String key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		*/
		for(int i=max;i>0;i--) {
			for(String key:map.keySet()) {
				if(map.get(key)==1) {
					System.out.printf("%s:%d\n",key,i);
				}
			}
		}
		
	}

}
