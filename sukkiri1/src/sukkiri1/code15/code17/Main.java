package sukkiri1.code15.code17;

import java.time.LocalDate;
import java.time.Period;

public class Main {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2023, 1, 1);
		LocalDate d2 = LocalDate.of(2023, 1, 4);

		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);//第一引数に小さいほう
		
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3);
		
	}

}
