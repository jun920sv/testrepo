package print14.Question06;

import java.util.Comparator;

public class ComparatorFactory {
	
	
	public static Comparator<Person>createComparator(String str){

	
			switch (str) {
			case "NAME":
				return new NameComparator();
			case "AGE":
				return new AgeComparator();
			default:
				throw new IllegalArgumentException("無効");
			}
			
	}
	
	
}
