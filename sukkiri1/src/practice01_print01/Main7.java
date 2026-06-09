package practice01_print01;

public class Main7 {

	public static void main(String[] args) {
		int month = 6;
		System.out.println("今月は" + month + "月です");

		++month;
		System.out.println("来月は" + month + "月です");
		
		System.out.println("その翌月は" + ++month + "月です");
		System.out.println("その翌月は" + ++month + "月です");

	}

}
