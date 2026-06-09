package print13;

public abstract class Employee {//abstractメソッドがあるから

	protected String name; //名前
	protected int baseSalary; // 正社員:月給 / パート:時給

	public Employee(String name, int baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	/*
	 * コンストラクタ
	 * 引数：String name , int baseSalary
	 * 処理：引数の値をフィールドにセットする
	 */

	public String getName() {
		return this.name;

	}
	/*
	 * 動的メソッド：getName
	 * 引数：なし
	 * 戻り値：String
	 * 処理：名前を返す
	 */

	public abstract int calcSalary();
	/*
	 * 抽象メソッド：calcSalary
	 * 引数：なし
	 * 戻り値：int
	 */

	public String getInfo() {
		return "名前:"+this.name +" 給料:"+ calcSalary()+"円";
	}
	/*
	 * 動的メソッド：getInfo
	 * 引数：なし
	 * 戻り値：String
	 * 処理：「名前：　給与：　円」の形式で表示する
	 */

}
