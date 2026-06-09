package print07;

public class Questions10 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.printf("処理開始：%d\n", start);
		String str = "";
		for (int i = 0; i < 100_000; i++) {
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.printf("処理終了：%d\n", end);
		System.out.printf("処理時間：%dミリ秒\n", (end - start));

		start = System.currentTimeMillis();
		System.out.printf("処理開始：%d\n", start);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100_000; i++) {
			sb.append("a");
		}
		end = System.currentTimeMillis();
		System.out.printf("処理終了：%d\n", end);
		System.out.printf("処理時間：%dミリ秒\n", (end - start));

	}
}
