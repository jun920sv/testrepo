package print13;

import java.util.ArrayList;

public class Question01 {

	public static void main(String[] args) {

		//Employee型のArrayListを宣言する(多態性管理)　変数名：list
		ArrayList<Employee> list = new ArrayList<Employee>();

		//Bob 月給：250000
		FullTimeEmployee emp = new FullTimeEmployee("Bob", 250000);
		list.add(emp);
		
		//Alice 時給1500　80時間勤務
		list.add(new PartTimeEmployee("Alice", 1500, 80));

		//拡張for文使ってlistの中身を順番に表示す
		
		for(Employee e : list) {
			System.out.println(e.getInfo());
		}
		
		System.out.println(emp.getInfo());
	}

}
