package print04;

public class Question14_4 {
	
	
	public static boolean isNotTarget(int x, int y, int[] v, String[][] array) {
		return !array[y + v[0]][x + v[1]].equals("■");
	}
	
	public static boolean check(int x, int y, String[][] array) {
		int[][] v = {
				{ -1, -1 }, { -1, 0 }, { -1, 1 },
				{ 0, -1 }, { 0, 1 },
				{ 1, -1 }, { 1, 0 }, { 1, 1 }
		};
		for (int[] arr : v) {
			if (isNotTarget(x, y, arr, array)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[][] array = {
				{ "■", "□", "■", "■", "□" },
				{ "□", "■", "■", "■", "■" },
				{ "□", "■", "□", "■", "□" },
				{ "■", "■", "■", "■", "□" },
				{ "■", "□", "■", "□", "■" }
		};
		for (int i = 1; i < array.length - 1; i++) {
			for (int j = 1; j < array[i].length - 1; j++) {
				if (check(j, i, array)) {
					System.out.println("(" + j + "," + i + ")");
				}
			}
		}
	}
}
