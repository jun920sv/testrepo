package sukkiri1.code03.code02;

public class Main {

	public static void main(String[] args) {
		boolean door = true;
		final boolean CLOSE = true;
		final boolean OPEN = false;

		int minitu = 0;

		while (door == OPEN && minitu < 5) {
			System.out.println("ノックする");
			System.out.println("１分待つ");
			minitu++;

		}
		System.out.print("開いた");
	}
}
