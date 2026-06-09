package print07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Questions01 {

	public static void main(String[] args) {
		Date now1 = new Date();
		System.out.println(now1);
		
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println(d);

		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:m:ss");
		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);
		
	}

}
