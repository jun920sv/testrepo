package print10;

import java.util.ArrayList;

/*  アイテム情報を管理するためのクラス 
 */

public class ItemManager {
	//Item型のArrayList 変数名：list
	ArrayList<Item> list;

	//コンストラクタ 

	public ItemManager() {
		//ArrayListを宣言してインスタンスをlistに代入 
		list = new ArrayList<Item>();
	}

	/*
	* メソッド名：addItem 
	*  引数：String name , int price
	*   戻り値：なし 
	*   処理：アイテムの登録を行う 
	*    ①Itemクラスのインスタンスを生成する 
	*    ②listに①で作ったインスタンスを追加する 
	*/
	public void addItem(String name, int price) {
		Item i = new Item(name, price);
		this.list.add(i);
	}

	/*メソッド名：showItems 
	 * 引数：なし * 戻り値：なし 
	 *  処理：拡張for文を使ってItemインスタンスの情報を全て出力表示する。 
	 *  */
	public void showItems() {
		for (Item item : this.list) {
			System.out.printf("%s:%d\n", item.getName(), item.getPrice());

		}

	}
}
