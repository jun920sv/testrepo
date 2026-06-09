package sukkiri1.code04.code07;

public class Main {

	public static void main(String[] args) {
		int[] scores = { 200, 30, 40, 50, 80 };
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は:"+count);
	}//一直線に探す探索　線形探索 アルゴリズム

}
