package sukkiri1.code02.code15;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		int r = new java.util.Random().nextInt(90);//0から89 まで
		int r = new Random().nextInt(90);//0から89 まで
		System.out.println(r);
		
		Random random = new Random();
		int ra =random.nextInt(90);
		System.out.println("あなたは多分"+ra+"歳ですね");
		
		
		
	}

}
