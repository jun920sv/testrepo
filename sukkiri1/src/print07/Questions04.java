package print07;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Questions04 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(1995,1,17);
		LocalTime d2 = LocalTime.of(5,46,52);
		
		LocalDate d3 = LocalDate.of(2011,3,11);
		LocalTime d4 = LocalTime.of(14,46,18);
		
		Period p1 = Period.between(d1, d3);
		Duration p2 = Duration.between(d2, d4);
	
		System.out.printf("%d年%dヶ月%d日/%d時間%d分%d秒差です",p1.getYears(),p1.getMonths(),
				p1.getDays(),p2.toHours(),p2.toMinutesPart(),p2.toSecondsPart());
		
	}

}
