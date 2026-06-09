package sample;

import java.util.Scanner;

class Ringo {
	int kosuu;
	int omosa;
}

class Mikan {
	int kosuu;
	int omosa;
}

public class SampleMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// オブジェクト作成
		Ringo r1 = new Ringo();
		Mikan m1 = new Mikan();

		// りんご入力
		System.out.print("りんごの購入数：");
		String ringo = sc.next();
		int R = Integer.parseInt(ringo);
		r1.kosuu = R;
		r1.omosa = 300;

		// みかん入力
		System.out.print("みかんの購入数：");
		String mikan = sc.next();
		int M = Integer.parseInt(mikan);
		m1.kosuu =M;
		m1.omosa = 140;

		int goukei = (r1.kosuu * r1.omosa) + (m1.kosuu * m1.omosa);

		// 表示
		System.out.println("りんごは " + r1.kosuu + " 個で " + (r1.kosuu * r1.omosa) + " グラム");
		System.out.println("みかんは " + m1.kosuu + " 個で " + (m1.kosuu * m1.omosa) + " グラム");
		System.out.println("合計 " + goukei + " グラムです");

	}

}
