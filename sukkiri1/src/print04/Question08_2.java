package print04;

public class Question08_2{
	public static void main(String[] args) {
		//int[][] matrix = { { 10, 20, 30 }, { 50, 99, 10 }, { 40, 60, 20 } };
		
		int[][] matrix = new int[3][];
		matrix[0]=new int []{ 10, 20, 30 };
		matrix[1]=new int []{ 50, 99, 10 };
		matrix[2]=new int []{ 40, 60, 20 };
		
		
		
		for(int[]arr:matrix) { //書き換えないから拡張for文 
			for(int v:arr) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		System.out.println("=================");

		//書き換えるからfor文
		for (int i = 0; i < matrix.length; i++) { //こっちはiの数を見てる
			for (int j = 0; j < matrix[i].length; j++) {//要素の中の要素数のため[i].length jの数
				if (matrix[i][j] == 99) {
					matrix[i][j] = 70;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================");

		int[] sum = new int[matrix[0].length];//これで列の数を調べてる 列　j 横 
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < matrix.length; j++) {//行数を調べたいから　matrix.length 10.50.40 
				sum[i] += matrix[j][i];//sum[i]に 入るやつ→　つまり縦　ji  00 01 02 | 10 11 12  ←動く順番

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(sum[i] + " ");
		}

	}
}

