package print10;

public class Questions02 {
	public static void main(String[] args) {
		
		ItemManager im = new ItemManager();

		//ItemManagerクラスの宣言 

		/* 
		 *  アイテムの登録を行う 
		 *  アイテム名 価格 
		 *  ①りんご 120 
		 *   ②みかん 80  
		 */

		im.addItem("りんご", 120);
		im.addItem("みかん", 80);

		//アイテムを全て表示
		im.showItems();

	}
}
