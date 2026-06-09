package print10;

public class Questions04 {
	public static void main(String[] args) {
		
		//部署作成 
		Department d1= new Department(1,"営業部", "大阪");
		Department d2 = new Department(2,"総務部", "東京");
		Department d3= new Department(3,"開発部", "大阪");
		
		//従業員の作成 
		Employee e1 =new Employee(1, "Bob",d1,250000);
		Employee e2 =new Employee(2, "Alice",d2,220000);
		Employee e3 =new Employee(3, "Charile",d3,330000);
		Employee e4 =new Employee(4, "Iris",d1,230000);
		Employee e5 =new Employee(5, "John",d3,400000);
		Employee e6 =new Employee(6, "Joseph",d2,270000);
		Employee e7 =new Employee(7, "Armin",d2,300000);
		
		//Bobの部署情報を見る 
		
		
		System.out.println("Bobの所属部署名："+e1.getDepartment().getDepartment_name() ); 
		
		System.out.println("Bobの所属部署住所："+d1.getDepartment_location() ); 
		
		
		//開発部の所属している人の一覧を取得 
		
		System.out.println("開発部の所属人数：" + d3.getDepartmentNumber() +"人"); 
		
		System.out.println("開発部の所属者"); 
		e2.getDepartment().getAllEmployeeName();
		
		
		//Aliceと同じ部署の人一覧 
		
		System.out.println("Aliceの所属先のメンバー一覧表"); 
		e2.getDepartment().getAllEmployeeName();
		
		//各部署ごとの給与総額 
		
		System.out.println("営業部の月給総額"  );
		System.out.println(d1.getEmployeeTotalSalary()+"円");
		
		System.out.println("総務部の月給総額" );
		System.out.println(d2.getEmployeeTotalSalary()+"円");
		
		System.out.println("開発部の月給総額" ); 
		System.out.println(d3.getEmployeeTotalSalary()+"円");
	}

}


