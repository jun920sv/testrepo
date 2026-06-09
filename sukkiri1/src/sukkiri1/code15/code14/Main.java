package sukkiri1.code15.code14;

import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
	Instant i1 = Instant.now();//DATE型の後継
	
	
	System.out.println(i1);//
	
	long l = i1.toEpochMilli();
	System.out.println(new Date(l));
	
	ZonedDateTime z1 = ZonedDateTime.now();//カレンダークラスの後継
	System.out.println(z1);
	ZonedDateTime z2 = ZonedDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
	System.out.println(z2);
	
	Instant i3 = z2.toInstant();
	ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
	System.out.println("東京:"+z2.getYear()+z2.getMonth()+z2.getDayOfMonth());
	
	if(z2.isEqual(z3)) { //isEqual と　equal
		System.out.println("同じ時間");
	}
	
	}

}
