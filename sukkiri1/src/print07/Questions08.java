package print07;

import java.time.Instant;
import java.util.Date;

public class Questions08 {
	public static void main(String[] args) {

		Date d = new Date();
		Instant instant = d.toInstant();
		System.out.println(instant);
		System.out.println("DateからInstantへの変換:"+instant);
		System.out.println("InstantからDateへの変換:"+new Date(instant.getEpochSecond()));
		System.out.println("InstantからDateへの変換:"+Date.from(instant));
		
		
		
		
	}

}
