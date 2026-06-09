package sukkiri1.code15.code13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd HH:m:ss EEEE");
		/*
		Date d = f.parse("2023/09/18 05:53:20");
		System.out.println(d);
		*/
		
		Date now = new Date();
		String s = f.format(now);//これが多い ただ古いクラス
		System.out.println("現在は"+s+"です");

	}
}
