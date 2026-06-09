package sukkiri1.code15.code09;

public class Main {
	public static void main(String... args) {//可変長引数でもOK
		//フォーマットのような変わらないものは定数でfinalすることが多い
		final String FORMAT = "%-9s %-7s 所持金%,6d";

		String s = String.format(FORMAT, "minato", "hero", 280);
		System.out.println(s);
		System.out.println(FORMAT.formatted("asaka", "witch",3200));
		System.out.printf(FORMAT, "sugawara", "sage", 4100);
		System.out.println();
		System.out.printf("製品番号%s-%02d","SJV",3);
		System.out.println();
		method(10,20,40);
		System.out.println();
		method(new int[] {1,2,3,4,5,6,7,8,9,});
	
	
	}
	
	
	public static void method(int...a) {//可変長引数
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}
	

}
