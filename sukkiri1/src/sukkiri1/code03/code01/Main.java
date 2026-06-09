package sukkiri1.code03.code01;

public class Main {
		
	public static void main(String[] args) {
		boolean tenki = false;
		final boolean SUNNY = true;
		final boolean RAIN = false;
		
		String msg;

		if (tenki == SUNNY) {
			System.out.println("""
					洗濯をします
					散歩に行きます
					""");
			msg= "晴れでした";
			
		} else {
			msg= "雨でした";
			System.out.println(msg+"。映画を見ます");
		}

	}

}
