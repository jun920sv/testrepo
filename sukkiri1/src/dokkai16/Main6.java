package dokkai16;

import java.util.Arrays;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {
		List<Integer> sales = Arrays.asList(1200, 800, 1500, 500);
		int total = calcTotal(sales);
		System.out.println(total);
	}

	static int calcTotal(List<Integer> list) {
		int sum = 0;
		for (int s : list) {
			if (s >= 1000) {
				sum += s;
			}
		}
		return sum;
	}

}
