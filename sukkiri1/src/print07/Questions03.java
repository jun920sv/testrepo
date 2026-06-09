package print07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Questions03 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("yyyy年MM月dd日（E） HH時mm分ss秒");
		LocalDateTime ldate = 
				LocalDateTime.now();
		System.out.println(fmt.format(ldate));
		

	}

}
