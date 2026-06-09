package print09;

public class Questions06 {

	public static void main(String[] args) {

	// PersonBuilderを使ってPersonインスタンスを生成 
		
		Person2 p1 = new PersonBuilder2()
				.name("Bob") //Bob 
				.age(25) //25
				.build(); 
	// PersonBuilderを使ってPersonインスタンスを生成 
	//name = John , age = 40 
		Person2 p2 = new PersonBuilder2()
				.name("John")
				.age(40)
				.build(); 
		
		p1.show();
		p2.show();
		
	// p1,p2のshowメソッドを呼ぶ

	}

}
