package print07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Questions02 {

	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();//現在日時取得
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日（E） HH時mm分ss秒");	
		Date future = c.getTime();
		System.out.println(f.format(future));
	}

}
