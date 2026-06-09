package sample;
	import java.util.Scanner;

	// 共通クラス：フルーツ
	class Fruit {
	    int kosuu;  // 個数
	    int omosa;  // 1個あたりの重さ（グラム）

	    // コンストラクタで重さをセット
	    Fruit(int omosa) {
	        this.omosa = omosa;
	    }

	    // 自分の合計重量を返すメソッド
	    int totalWeight() {
	        return kosuu * omosa;
	    }
	}

	public class SampleMain05_2 {

	    // フルーツの個数を入力する共通メソッド
	    static int inputKosuu(Scanner sc, String fruitName) {
	        System.out.print(fruitName + "の購入数：");
	        return Integer.parseInt(sc.next());
	    }

	    // フルーツの情報を出力する共通メソッド
	    static void printFruit(String name, Fruit f) {
	        System.out.println(name + "は " + f.kosuu + " 個で " + f.totalWeight() + " グラム");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // フルーツオブジェクト作成（りんご・みかん）
	        Fruit r1 = new Fruit(300); // りんご1個300g
	        Fruit m1 = new Fruit(140); // みかん1個140g

	        // 購入個数入力
	        r1.kosuu = inputKosuu(sc, "りんご");
	        m1.kosuu = inputKosuu(sc, "みかん");

	        // 合計重量計算
	        int goukei = r1.totalWeight() + m1.totalWeight();

	        // 出力
	        printFruit("りんご", r1);
	        printFruit("みかん", m1);
	        System.out.println("合計 " + goukei + " グラムです");
	    }
	}
	
