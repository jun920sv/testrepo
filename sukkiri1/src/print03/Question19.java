package print03;

import java.util.Random;

class O {

	static void a() {
		Random rand = new Random();
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (i == 3 && j == 3) {
					System.out.print("☆ ");
					continue;
				}
				int r = rand.nextInt(5) + 1;
				sum += r;
				if (sum < 10) {
					System.out.print(" ");
				}
				System.out.print(sum + " ");

			}
			System.out.println(" ");
		}

	}

}

public class Question19 {
	public static void main(String[] args) {

		O.a();

	}

}
