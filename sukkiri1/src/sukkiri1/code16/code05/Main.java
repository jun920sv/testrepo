package sukkiri1.code16.code05;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	
	Set<String>words = new TreeSet<String>();
	words.add("dog");
	words.add("cat");
	words.add("wolf");
	words.add("panda");
	words.add("cat");
	
	for(String s:words) {
		System.out.printf("%s⇒",s);
	}

	}

}
