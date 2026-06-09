package print10;

import java.util.ArrayList;

public class Questions01 {
	public static void main(String[] args) {

		// ① 
		ArrayList<Person> list = new ArrayList<Person>();

		// ② 
		list.add(new Person("Bob", 14, 0));
		list.add(new Person("Alice", 15, 1));
		list.add(new Person("Carol", 13, 1));
		list.add(new Person("Charlie", 15, 0, "サイクリング"));

		// ③ 
		list.removeIf(p -> p.getName().equals("Carol"));
		
		/*
		for(int i= 0; i<list.size();i++) {
			if(list.get(i).getName().equals("Carol")) {
				list.remove(i);
				i--;//インデックスが詰められるので
			}
		}
		 */
		// ④ 
		list.remove(0);
		
		// ⑤ 
		for(Person p :list) {
			p.show();
		}
	}

}
