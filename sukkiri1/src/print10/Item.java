package print10;

/* * アイテム情報を持つクラス */

public class Item {
	private String name; //アイテム名 
	private int price; //値段 

	//コンストラクタ 
	public Item(String name, int price) {
		this.name = name;
		this.price = price;

	}

	/* 
	 * メソッド名：getName
	 *  処理：フィールド値を返す 
	 */
	public String getName() {
		return name;

	}

	/* メソッド名：getPrice 
	 *  処理：フィールド値を返す 
	 */
	public int getPrice() {
		return price;
	}
}

