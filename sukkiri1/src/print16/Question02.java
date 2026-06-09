package print16;

import java.util.HashSet;

public class Question02 {
	public static void main(String[] args) {

		// HashSet<String>の宣言 変数名：strSet 
		HashSet<String> strSet = new HashSet<String>();

		// 配列の要素をstrSetにfor文を使って追加 
		String[] names = { "Alice", "Bob", "John", "Bob", "Carol" };
		for (String name: names) {
			strSet.add(name);

		}

		// strSetの要素を全て表示 
		for (String a : strSet) {
			System.out.println(a);
		}
		//4 Johnを取り除く 
		strSet.remove("John");
		//5 再度表示 

		for (String a : strSet) {
			System.out.println(a);
		}
		//6 strSetの要素数を表示 
		
		System.out.println("strSetの要素数：" +strSet.size());
		//System.out.println("strSetの要素数：" + );

	}
}
