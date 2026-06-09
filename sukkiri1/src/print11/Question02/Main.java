package print11.Question02;

public class Main {

	public static void main(String[] args) {

		Product[] array = new Product[3];

		array[0] = new Food("パン", 120, 3);
		array[1] = new Food("牛乳", 200, 2);
		array[2] = new Book("スッキリわかるJava入門", 2700, "中山清喬");

		Product[] array1 = {
				new Food("パン", 120, 3),
				new Food("牛乳", 200, 2),
				new Book("スッキリわかるJava入門", 2700, "中山清喬")
		};

		/*
		 * 配列の宣言
		 * 　次の①～③のインスタンスを生成し配列に格納する
		 * 　① 商品名：パン　価格：120　賞味期限：3日
		 * 　② 商品名：牛乳　価格：200　賞味期限：2日
		 * 　③ 商品名：スッキリわかるJava入門　価格：2700　著者：中山清喬
		 */

		for (Product p : array) {
			p.showInfo();
		}
		//全商品を順番に表示

	}

}
