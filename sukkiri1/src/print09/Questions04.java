package print09;

public class Questions04 {

	public static void main(String[] args) {
		
		//Addressインスタンスの生成 
		Person1 p =new Person1("太郎");		
		
		Address1 a = new Address1(p,"東京");
				
		p.setAddress(a);
				
				
		//introduceを呼ぶ
		p.introduce();
		
		System.out.println( p.getName()+ "が住んでいます。");
		System.out.println( a.getOwner().getName()+ "が住んでいます。");
		
	}

}
