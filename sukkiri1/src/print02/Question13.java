package print02;

import java.util.Scanner;

class Year {
	int seireki;

	public Year() {
		Scanner sc = new Scanner(System.in);
		System.out.println("西暦をいれてください");
		seireki = sc.nextInt();
	}

	String kai() {
		if (1989 <= seireki && seireki <= 2019) {
			if (seireki % 4 == 0) {
				if (seireki % 100 == 0) {
					if (seireki % 400 == 0) {
						return "うるう年です";
					} else {
						return "平成です";
					}
				} else {
					return "うるう年です";
				}
			} else {
				return "平成です";
			}
		} else {
			return "平成ではない";
		}
	}
}
	public class Question13 {
	public static void main(String[] args) {
		Year a = new Year();
		String b = a.kai();
		int seireki = a.seireki;
		System.out.println(seireki+"年は"+b);
		

		
		
	}

}
