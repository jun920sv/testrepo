package sukkiri1.code15.code10;

public class Main {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		System.out.println(start);

		String s = null;
		for (int i = 0; i < 100_00; i++) {
			s += "! !";

		}
		long end = System.currentTimeMillis();
		System.out.println(end);

		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");
	
		
	}
}
