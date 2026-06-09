package print04;

public class Question14 {
	public static void main(String[] args) {

		String[][] array = {
				{ "■", "□", "■", "■", "■" },
				{ "□", "■", "■", "■", "■" },
				{ "□", "■", "■", "■", "■" },
				{ "■", "■", "■", "■", "□" },
				{ "■", "□", "■", "□", "■" }
		};
		boolean bool = false;

		for (int i = 1; i < array.length - 1; i++) {
			for (int j = 1; j < array[i].length - 1; j++) {
				if (array		[i - 1][j - 1].equals("■")
						&& array[i - 1][j].equals("■")
						&& array[i - 1][j + 1].equals("■")
						&& array[i][j - 1].equals("■")
						&& array[i][j + 1].equals("■")
						&& array[i + 1][j - 1].equals("■")
						&& array[i + 1][j].equals("■")
						&& array[i + 1][j + 1].equals("■")) {
					//探したい値が見つかったとき
					bool = true;
					if (bool) {
						System.out.println("インデックス番号：" + "(" + i + "," + j + ")");
					}

				}
			}
		}
		if (bool == false) {
			System.out.println("該当なし");
		}
	}
}
