package print04;

public class Question03 {
	public static void main(String[] args) {

		double[] temp = { 33.2, 33.6, 34.9, 38.4, 34, 30.7, 27.5 };
		double goukei = 0;

		for (int i = 0; i < temp.length; i++) {
			goukei = goukei + temp[i];
		}
		double heikin = (goukei / temp.length);
		System.out.println("平均気温は" + heikin+"度です");
		System.out.println("平均気温は" + Math.round(heikin*10)/10.0+"度です");
		System.out.printf("平均気温は%.1f度です\n",heikin);// .1 有効桁数決めれる

	}

}
