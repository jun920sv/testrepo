package print07;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Questions07 {
	public static void main(String[] args) {

		Period p = Period.of(4, 3, 7);
		LocalDateTime future = LocalDateTime.now().plus(p);
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("4年3ヶ月7日後の日時:yyyy年MM月dd日 HH時mm分ss秒");
	System.out.println(fmt.format(future));
	
	
	
	}
}
