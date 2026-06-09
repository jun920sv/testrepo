package sukkiri1.code15.code16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = 
				LocalDate.parse("2023/09/22",fmt);
		System.out.println(ldate);
		
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println(str);
		
		LocalDate now = LocalDate.now();
		if(now.isAfter(ldatep)) {
			System.out.println("本日はその日より未来です");
		}
		
		

	}

}
