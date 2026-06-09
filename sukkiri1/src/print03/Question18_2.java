package print03;

import java.util.Scanner;

class N2 {
	static void a() {
		Scanner sc = new Scanner(System.in);

		final boolean WHITE = true;
		final boolean BLACK = false;
		final char WHITE_STAR = '☆';
		final char BLACK_STAR = '★';

		System.out.print("nを入力:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			boolean isWhite = i % 2 != 0 ? WHITE : BLACK;//最初の１つ目を決める
			for (int j = 1; j <= n; j++) {

				System.out.print(isWhite ? WHITE_STAR : BLACK_STAR);
				//交互に出力したいので反転
				isWhite = !isWhite;
			}
			System.out.println("");
		}
		
	}
}

public class Question18_2 {
	public static void main(String[] args) {
		N2.a();

	}

}
