
package print04;

//フィールド
//配列の盤面 盤面を呼び出し bloc
//８方向の確認 true かfalse　か check8bloc
//例外 ダメなら true にしておいて ダメならfalse  exception
//
//結果 show 出力 show
//
//

class Bloc {
	boolean bool = false;
	boolean faund = false;

	static String[][] array = {
			{ "■", "□", "■", "■", "■" }, //ブロック
			{ "□", "■", "■", "■", "■" },
			{ "□", "■", "■", "■", "■" },
			{ "■", "■", "■", "■", "□" },
			{ "■", "■", "■", "□", "□" },
			{ "■", "■", "■", "□", "□" }
	};

	String[][] bloc() {
		return array;
	}

	static int row() {
		return array.length;
	}

	static int column(int i) {
		return array[i].length;

	}
	
	public static class Check8bloc {
		int[][] arr = { { -1, -1 }, { -1, 0 }, { -1, 1 }, //8方向 arr[0][0] { -1,←　これ }arr[0][1] { これ→, -1 }
				{ 0, -1 }, { 0, +1 }, //
				{ +1, -1 }, { +1, 0 }, { +1, 1 } };

		boolean check() {

			for (int i = 1; i < row() - 1; i++) {//6回
				for (int j = 1; j < column(i) - 1; j++) {

					boolean bool = true;

					for (int k = 0; k < row(); k++) {//ただ8回回したいからk 
						int x1 = i + arr[k][0];//現在地からの場所 方向　ずれ
						int y1 = j + arr[k][1];

						if (x1 < 0 || y1 < 0 || x1 >= row() || y1 >= column(i)) {//ダメな範囲　だめなら飛ばす
							return false;

						}
						if (!array[x1][y1].equals("■")) {//8方向確認 
							return false;
						}

					}

				}
			}
			return true;

		}
	}
}

public class Question14_3 {
	public static void main(String[] args) {
		
		

	}

}
