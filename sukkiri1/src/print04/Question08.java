package print04;

public class Question08 {
	public static void main(String[] args) {
		int[][] matrix = { { 10, 20, 30 }, { 50, 99, 10 }, { 40, 60, 20 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 99) {
					matrix[i][j] = 70;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=================");

		int[] sum = new int[3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum[j] += matrix[i][j];

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(sum[i] + " ");
		}

	}
}
