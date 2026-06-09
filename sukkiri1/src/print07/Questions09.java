package print07;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Questions09 {
	public static void main(String[] args) {
		
		ZonedDateTime nowNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
		ZonedDateTime nowLondon = nowNY.withZoneSameInstant(ZoneId.of("Europe/London"));

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分ss秒");
		System.out.println("ニューヨークの現在の日時:"+fmt.format(nowNY));
		System.out.println("ロンドンの	  現在の日時:"+fmt.format(nowLondon));
		
		
	}

}
