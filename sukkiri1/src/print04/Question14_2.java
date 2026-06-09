package print04;

public class Question14_2 {
	public static void main(String[] args) {

		boolean faund = false;

		String[][] array = {
				{ "■", "□", "■", "■", "■" }, //ブロック
				{ "□", "■", "■", "■", "■" },
				{ "□", "■", "■", "■", "■" },
				{ "■", "■", "■", "■", "□" },
				{ "■", "■", "■", "□", "□" },
				{ "■", "■", "■", "□", "□" }
		};

		int[][] arr = { { -1, -1 }, { -1, 0 }, { -1, 1 }, //8方向 arr[0][0] { -1,←　これ }arr[0][1] { これ→, -1 }
				{ 0, -1 }, { 0, +1 },					  //
				{ +1, -1 }, { +1, 0 }, { +1, 1 } };

		for (int i = 1; i < array.length - 1; i++) {//6回
			for (int j = 1; j < array[i].length - 1; j++) {
				
				boolean	bool = true; //いいよからダメにしていく
				
				for (int k = 0; k < arr.length; k++) {//ただ8回回したいからk 
					int x1 = i + arr[k][0];//現在地からの場所 方向　ずれ
					int y1 = j + arr[k][1];
					
					if (x1 < 0 || y1 < 0 || x1 >= array.length || y1 >= array[i].length) {//ダメな範囲　だめなら飛ばす
						bool = false;
						continue;
					}
					if (!array[x1][y1].equals("■")) {//8方向確認 
						bool = false;
						continue;
					}
				}
				if (bool) { //	全部OKならここになる 
					System.out.println("インデックス番号：" + "(" + i + "," + j + ")");
					faund = true;
				}
			}
		}
		if (faund == false) {
			System.out.println("該当なし");
		}
	}
}
