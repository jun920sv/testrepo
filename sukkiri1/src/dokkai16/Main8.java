package dokkai16;

import java.util.Arrays;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<String> logs = Arrays.asList("tanaka:8", "suzuki:6", "sato:9");
		makeReport(logs);
	}

	static void makeReport(List<String> list) {
		for (String s : list) {
			String[] data = s.split(":");	
			String name = data[0];
			int hour = Integer.parseInt(data[1]);
			String grade = judge(hour);
			System.out.println(name.toUpperCase() + " -> " + grade);
		}
		
	}

	static String judge(int h) {
		if (h >= 8)
			return "A";
		if (h >= 7)
			return "B";
		return "C";
	}
}
