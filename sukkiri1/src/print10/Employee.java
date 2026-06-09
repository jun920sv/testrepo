package print10;

public class Employee {

	private int employee_id;//ID 
	private String employee_name; //名前 
	private Department department; //所属 
	private int salary; //月給 

	public Employee(int employee_id, String employee_name, Department department, int salary) {
		this.employee_id=employee_id;
		this.employee_name=employee_name;
		this.department=department;
		this.salary=salary;
		this.department.addEmployee(this);

	}
	
	/* * メソッド名：Employee（コンストラクタ） 
	 * * 引数：int employee_id, String employee_name, Department department, int salary 
	 * * 処理内容：従業員情報を初期化し、所属部署の従業員リストに自分自身を追加する 
	 * */
	
	public int getEmployee_id() {
		return this.employee_id;
	}

	/* * メソッド名：getEmployee_id 
	 * * 引数：なし 
	 * * 戻り値：int 
	 * * 処理内容：従業員IDを取得する 
	 * */

	public void setEmployee_id(int employee_id) {
		this.employee_id=employee_id;
	}
	
	/* * メソッド名：setEmployee_id 
	 * * 引数：int employee_id 
	 * * 戻り値：なし 
	 * * 処理内容：従業員IDを設定する 
	 * */

	public String getEmployee_name() {
		return this.employee_name;
	}
	
	/* * メソッド名：getEmployee_name 
	 * * 引数：なし 
	 * * 戻り値：String 
	 * * 処理内容：従業員名を取得する 
	 * */
	
	public void setEmployee_name(String employee_name) {
		this.employee_name=employee_name;
	}

	/* * メソッド名：setEmployee_name 
	 * * 引数：String employee_name 
	 * * 戻り値：なし 
	 * * 処理内容：従業員名を設定する */

	public Department getDepartment() {
		return this.department;
	}
	
	/* * メソッド名：getDepartment 
	 * * 引数：なし 
	 * * 戻り値：Department 
	 * * 処理内容：所属部署を取得する */

	public void setDepartment(Department department) {
		this.department=department;
		department.addEmployee(this);
	}
	
	/* * メソッド名：setDepartment 
	 * * 引数：Department department 
	 * * 戻り値：なし 
	 * * 処理内容：所属部署を設定する 
	 * */

	public int getSalary() {
		return this.salary;
	}
	
	/* * メソッド名：getSalary 
	 * * 引数：なし 
	 * * 戻り値：int 
	 * * 処理内容：月給を取得する */

	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	/* * メソッド名：setSalary 
	 * * 引数：int salary 
	 * * 戻り値：なし 
	 * * 処理内容：月給を設定する 
	 * */

}
