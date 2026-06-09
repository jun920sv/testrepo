package print16;

import java.util.HashMap;

public class Question03 {
	public static void main(String[] args) {

		// HashMap<String,String>を宣言する。変数名はmap 
		HashMap<String,String> map= new HashMap<String,String>(); 
		
		String[] country = {"日本","アメリカ","ロシア","フランス"}; 
		String[] capital = {"東京","ワシントン","モスクワ","パリ"}; 
		
		
		// 二つの配列をfor文で回し、keyをcountry、valueをcapitalにしてmapにデータを追加 
		for(int i=0; i<country.length;i++) {
			map.put(country[i], capital[i]);
		}
		
		// mapの中身を全て表示 表示形式：keyの首都はvalueです 
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		for(String value : map.values()) {
			System.out.println(value);
		}
		for(String key : map.keySet()) {
		    System.out.printf("%sの首都は%sです\n",key, map.get(key));
		}
		
		for(HashMap.Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "の首都は" + entry.getValue());
		}
		
		// mapの中にイギリスあるか判定 
		
		if(map.containsKey("イギリス")) { 
			System.out.println("イギリスはあります");
		
		}else { System.out.println("イギリスはありません");
		} 
		
		// mapの中身を全て削除 
		map.clear();
		//6 mapの要素数を表示 
		
		System.out.println(map.size());

	}

}
