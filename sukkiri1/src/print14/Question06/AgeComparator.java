package print14.Question06;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{

	//年齢で比較するルールを定義
	
	public int compare(Person o1, Person o2) {
		return o1.getAge()-o2.getAge();
	}	
	
}
