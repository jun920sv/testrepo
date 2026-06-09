package print10;

import java.util.ArrayList;

public class Department {

	private int department_id; //部署ID 
	
	private String department_name; //部署名 
	
	private String department_location; //部署所在地 
	
	private ArrayList<Employee> employee_list; //従業員リスト 
	
	
	public Department(int department_id, String department_name, String department_location) {
		this.department_id =department_id;
		this.department_name=department_name;
		this.department_location=department_location;
		 this.employee_list = new ArrayList<Employee>();
		
		
	}
	/* メソッド名：Department（コンストラクタ） 
	 * 引数：int department_id, String department_name, String department_location 
	 * 戻り値：なし 
	 * 処理内容：部署情報を初期化し、従業員リストを生成する 
	 */ 
	
	
	public int getDepartment_id() {
		return this.department_id;
	}
	
	/* メソッド名：getDepartment_id 
	 * 引数：なし * 戻り値：int
	 *  処理内容：部署IDを取得する */
	
	public void setDepartment_id(int department_id) {
		this.department_id =department_id;
	}
	
	/* メソッド名：setDepartment_id
	 * 引数：int department_id 
	 * 戻り値：なし
	 * 処理内容：部署IDを設定する
	 */ 
	
	public String getDepartment_name() {
		return this.department_name;
	}
	
	/* メソッド名：getDepartment_name
	 * 引数：なし * 戻り値：String
	 * 処理内容：部署名を取得する 
	 * */
	
	public void setDepartment_name(String department_name) {
		this.department_name=department_name;
	}
	
	/*
	 * メソッド名：setDepartment_name 
	 * 引数：String department_name 
	 * 戻り値：なし 
	 * 処理内容：部署名を設定する 
	 * */ 
	
	public String getDepartment_location() {
		return this.department_location;
	}
	
	/* メソッド名：getDepartment_location 
	 * 引数：なし * 戻り値：String 
	 * 処理内容：部署所在地を取得する 
	 * */ 
	
	public void setDepartment_location(String department_location) {
		this.department_location=department_location;
	}
	
	/* メソッド名：setDepartment_location 
	 * 引数：String department_location 
	 * 戻り値：なし 
	 * 処理内容：部署所在地を設定する 
	 * */
	
	public int getDepartmentNumber() {
		return this.employee_list.size();
	}
	
	/* * メソッド名：getDepartmentNumber 
	 * 引数：なし 
	 * 戻り値：int 
	 * 処理内容：所属従業員数を取得する 
	 * */ 
	
	public void getAllEmployeeName() {
		for(Employee e :this.employee_list) {
			System.out.println("名前:"+e.getEmployee_name());
		}
	}
	
	/* * メソッド名：getAllEmployeeName 
	 * 引数：なし 
	 * 戻り値：なし 
	 * 処理内容：所属従業員の名前をすべて表示する 
	 * */ 
	
	public int getEmployeeTotalSalary() {
		int total=0;
		for(Employee e: this.employee_list) {
			total+= e.getSalary();
		}
		return   total;
	}
	
	/* * メソッド名：getEmployeeTotalSalary
	 * 引数：なし 
	 * 戻り値：int
	 *  処理内容：所属従業員の給与総額を計算して返す 
	 *  */ 
	
	public void addEmployee(Employee employee ) {
		if(!this.employee_list.contains(employee)) {
		this.employee_list.add(employee);
		}
	}
	
     /* * メソッド名：addEmployee 
      * 引数：Employee employee 
      * 戻り値：なし
      *  処理内容：従業員を部署のリストに追加する 
      *  */ 
	
}
	