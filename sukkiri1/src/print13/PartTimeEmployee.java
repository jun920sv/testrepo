package print13;

public class PartTimeEmployee extends Employee {

	private int hour; //時間

	public PartTimeEmployee(String name, int payPerHour, int hour) {
		super(name, payPerHour);
		this.hour = hour;
	}
	/*
	 * コンストラクタ
	 * 引数：String name, int payPerHour, int hour
	 * 処理：引数２つは親クラスに。差分はフィールドにセットする
	 */

	@Override
	public int calcSalary() {

		return (super.baseSalary * this.hour);
	}
	/*
	 * 動的メソッド：calcSalary
	 * 親クラスの抽象メソッドを実装する
	 * 処理：時給×時間の値の結果を返す
	 */

}
