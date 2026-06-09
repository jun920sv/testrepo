package print09;

public class Questions03 {

	public static void main(String[] args) {
		
		
		//Addressインスタンスの生成 
		Address a = new Address("東京都","渋谷区");
		
		//Personインスタンスの生成 
		Person p =new Person("太郎",20,a);
		
		//introduceを呼ぶ
		p.introduce();
		
	}

}
