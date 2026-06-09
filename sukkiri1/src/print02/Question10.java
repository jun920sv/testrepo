package print02;

import java.util.Random;

class Fruit {
	int weight;
	int count;

	Fruit(int weight, int count) {
		this.weight = weight;
		this.count = count;
	}
	int toralWeight() {
		return weight * count;
		
	}
	
}

public class Question10 {
	public static void main(String[] args) {
		Random ran = new Random();
		int R = ran.nextInt(6)+5;
		int M = ran.nextInt(8)+4;
		
		Fruit ringo = new Fruit(150, R);
		Fruit mikan= new Fruit(120,M);
		
		int r1 = ringo.toralWeight();
		int m1 = mikan.toralWeight();
		
		if(r1>m1) {
			System.out.println("りんご:"+r1+"g");
			System.out.println("みかん:"+m1+"g");
			System.out.println("りんごの方が重いです");
			
		}else if (m1>r1) {
			System.out.println("りんご:"+r1+"g");
			System.out.println("みかん:"+m1+"g");
			System.out.println("みかんの方が重いです");
			
		}else if(m1==r1) {
			System.out.println("りんご:"+r1+"g");
			System.out.println("みかん:"+m1+"g");
			System.out.println("りんごとみかんの重さは同じです");
		}
		
		
	}

}
/*問10 【文章問題】
りんご1個150グラム、みかん1個120グラムの時、りんごＭ個、みかんＮ個購入します。
りんごの総重量とみかんの総重量を比較し、総重量の多いほうの果物を表示してください。
Ｍは５～１０個の範囲、Ｎは4個～１２個の範囲でランダムで取得してください。
実行結果
実行結果
実行結果
りんご：1200グラム。
みかん：1080グラム。
りんごのほうが重たいです
りんご：750グラム。
みかん：1320グラム。
みかんのほうが重たいです
りんご：1200グラム。
みかん：1200グラム。
りんごとみかんの重さは同じです
 */
