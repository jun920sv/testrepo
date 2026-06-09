package practice02_print01;

public class Main3 {

	public static void main(String[] args) {
		//長方形の一辺
		int tate = 10;
		int yoko = 20;
		//円の半径
		int radius = 5;
		//円周率（π）
		final double PI = 3.14;

		//長方形の外周の長さを表示 式： 縦＋縦＋横＋横
		int perimeter = tate + tate + yoko + yoko;

		System.out.println("外周の長さ：" + perimeter);
		//長方形の面積を表示 式：縦×横
		int area = tate * yoko;
		System.out.println("面積" + area);

		//円の外周の長さを計算 式：半径×2×π
		double circumference = radius * 2 * PI;
		//円の面積を計算 式：半径×半径×π
		double circleArea = radius * radius * PI;
		//円の外周の長さを整数値で表示（キャスト）
		int intCircumference = (int) circumference;
		System.out.println("円の外周の長さ（整数値）"
				+ intCircumference);
		//円の面積を整数値で表示（キャスト）
		int intCircleArea = (int) circleArea;
		System.out.println("円の面積（整数値）"
				+ intCircleArea);
	}

}
