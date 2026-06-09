package print07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Questions05 {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = 
				LocalDate.now();
		System.out.println(ldate);
		
		LocalDate ldatep = ldate.plusDays(7);
		String str = ldatep.format(fmt);//Stringと一緒で 変数に代入しないといけない。
		//戻り値で変えた中身を出力　だからもとのインスタンス一緒。
		System.out.println("7日後の日付は"+str);
		
		
		
		
	}

}
