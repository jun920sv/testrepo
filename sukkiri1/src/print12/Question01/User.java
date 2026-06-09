package print12.Question01;

public class User {

	private String name;
	private int age;
	private static int userCounter = 0;
	/*
	 * フィールド
	 * 動的フィールド：String name , int age
	 * 静的フィールド：int userCounter = 0
	 */

	public User(String name, int age) {
		this.name = name;
		this.age = age;
		User.userCounter++;
	}
	/*
	 * コンストラクタ
	 * 引数：String name , int age
	 * 処理：引数をフィールドにセット
	 * 　　　静的フィールドを＋１する。
	 */

	static void showCount() {
		System.out.println("インスタンス生成数：" + User.userCounter);
	}
	/*
	 * 静的メソッド
	 * メソッド名：showCount
	 * 引数：なし
	 * 戻り値：なし
	 * 処理：静的フィールドを表示する　「インスタンス生成数：　」の形式
	 */

	public String toString() {
		//	return "名前:" + name + "、" + "年齢:" + age;
		return "名前:%s、年齢:%d".formatted(this.name, this.age);
	}
	/*
	 * toString()メソッドをオーバーライドする
	 * 「名前：　、　年齢：　」の形式の文字列を返す
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		/*
		
		if (obj instanceof User u) {
			if (this.name.equals(u.name)&&this.age == (u.age)) {
					return true;
			}
		}return false;	
		}
		
		}*/
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		User u = (User) obj;

		return (this.name.equals(u.name) && this.age == (u.age));
	}
}

/*
 * equals()メソッドをオーバーライドする
 * ①等値(参照)かどうか判定する　：trueを返す
 * ②等価(中身)かどうか判定する　：trueを返す
 * ①も②も満たさない場合はfalseを返す
 */
