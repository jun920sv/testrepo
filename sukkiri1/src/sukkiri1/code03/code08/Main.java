package sukkiri1.code03.code08;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		Random rand = new Random();
		int fortune = rand.nextInt(5) + 1;
		
		switch (fortune) {
		case 1, 2:
			System.out.println("いいね");
			break;

		case 5:
			System.out.println("普通です");
			break;

		case 3, 4:
			System.out.println("うーん");
			break;

		}
		
		String s = switch(fortune) {
		case 1-> "大吉";
	
		case 2-> "中吉";
	
		case 3->"吉";
		
		default -> "凶";
	
		};
		
		
		System.out.println(s);
	
		
	}
}