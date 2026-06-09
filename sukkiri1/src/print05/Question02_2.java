package print05;

class Show {

	int plusOne(int a) {
		return a + 1;
	}

	void output(int a) {
		System.out.println(a);
	}

}

public class Question02_2 {
	public static void main(String[] args) {

		Show s = new Show();
		int a = 10;
		int b = s.plusOne(a);
		s.output(b);
	}

}
