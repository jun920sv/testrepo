package print03;

public class Question01 {
	public static void main(String[] args) {
		System.out.println("=====while文=====");
		int count = 1;
		while (count <= 5) {
			System.out.println(count);
			count++;
		}

		System.out.println("=====for文=====");
		for (count = 1; count <= 5; count++) {
			System.out.println(count);
		}
	}

}
