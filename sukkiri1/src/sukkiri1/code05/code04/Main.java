package sukkiri1.code05.code04;

public class Main {
	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
		add(200, "60");
	}

	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	public static void add(int x, String y) {
		String ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}


