package sukkiri1.code04.code01;

public class Main {
	public static void main(String[] args) {
		int[] scores = new int[5];		
		int num = scores.length;//パラメータをint型で取り出す
		System.out.println("要素数:" + num);

		int scores1[] = new int[5];//こっちの書き方もできるがNG
		int num1 = scores1.length;
		System.out.println("要素数:" + num1);

	}

}
