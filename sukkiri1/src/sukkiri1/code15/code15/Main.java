package sukkiri1.code15.code15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2024,1,1,9,5,0,0);
		
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
	
		
	}

}
