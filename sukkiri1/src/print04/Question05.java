package print04;

public class Question05 {
	public static void main(String[] args) {
		int count =0;

		String[] names = { "Bob", "John", "Alice", "Carol", "Charlie" };
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("Alice")) {
				break;
			}
			count++;
		}
		System.out.println(count+"番目にAliceがあります");

		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("Carol")) {
				names[i]="Ellen";
				}
			System.out.print(names[i]+" ");
		}
		
		
	}
}
