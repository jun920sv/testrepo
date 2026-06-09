package print13;

public class FullTimeEmployee extends Employee{

	
	public FullTimeEmployee(String name, int salary) {
		super(name, salary);
	}
	/*
	 * コンストラクタ
	 * 引数：String name, int Salary
	 * 処理：親クラスに引数を渡す
	 */

	@Override
	public int calcSalary() {
		return super.baseSalary;
	}
 
    	/*
    	 * 動的メソッド：calcSalary
    	 * 親クラスの抽象メソッドを実装する
    	 * 処理：月給を返す
    	 */

	
}
