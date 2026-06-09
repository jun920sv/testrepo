package sukkiri1.code15.code12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();//カレンダーは6つの年月日時分秒
		c.set(2023, 8, 18, 5, 53, 20);//年月日時分秒
		c.set(Calendar.MONTH, Calendar.OCTOBER);//
		c.set(Calendar.MONTH, 0);//カレンダーは0スタート気をつけろ
		c.set(Calendar.DAY_OF_MONTH, 10);

		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.MONTH));

		switch (c.get(Calendar.MONTH)) {
		case Calendar.JANUARY -> {
			System.out.println("1月です");
		}
		}

	}

}
