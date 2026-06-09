package print12.Question01;

public class Main {
	public static void main(String[] args) {
	
		// 1人目のUserインスタンス生成
				User u1 = new User("Alice",20);
				// userCounter値を表示
				User.showCount();
				// toStringを使って表示
				System.out.println(u1.toString());
				
				// 2人目のUserインスタンス生成
				User u2 = new User("Bob",21);
				// userCounter値を表示
				User.showCount();
				// toStringを使って表示
				System.out.println(u2.toString());
				// 3人目のUserインスタンス生成
				User u3 = new User("Alice",20);
				// userCounter値を表示
				User.showCount();
				// toStringを使って表示
				System.out.println(u3.toString());
				// 4人目のUserインスタンス生成
				User u4 = new User("Bob",22);
				// userCounter値を表示
				User.showCount();
				// toStringを使って表示
				System.out.println(u4.toString());
				//1人目と3人目を比較
				
				System.out.println((u1.equals(u3)));
				
				//2人目と4人目を比較
				System.out.println((u2.equals(u4)));

	}

}
