package sukkiri1.code16.code04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println(colors.size());

		for (String s : colors) {
			System.out.println(s);
		}
System.out.println();
		Set<String> colors1 = new LinkedHashSet<String>();//Linked入力順
		colors1.add("赤");
		colors1.add("青");
		colors1.add("黄");
		colors1.add("赤");
		System.out.println(colors1.size());

		for (String s : colors1) {
			System.out.println(s);
		}
	}

}
