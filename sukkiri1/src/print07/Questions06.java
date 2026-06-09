package print07;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Questions06 {
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		LocalTime future = now.plusHours(5);
		System.out.printf("5時間後の時刻:%tT\n",future);
		
		
		System.out.println(future.getHour());
		System.out.println(future.getMinute());
		System.out.println(future.getSecond());	
		
		
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("5時間後の時刻:HH時間mm分ss秒");
		System.out.println(fmt.format(future));
	}

}
