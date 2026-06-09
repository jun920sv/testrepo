package print09;

public class Questions01 {

	public static void main(String[] args) {
		//犬インスタンスの生成 dog 
		
		Animal dog = new Animal("ハチ",5,"狼","わんわん"); 
		
		//猫インスタンスの生成 cat 
		Animal cat = new Animal("ミケ",-1,"猫","にゃーにゃー"); 
		
		//犬インスタンスの種類を狼→犬に訂正する 
		
		
		dog.setKind("犬"); 
		
		
		//犬インスタンスの種類が更新されたか確認する 
		
		
		System.out.println("kind : " + dog.getKind()); 
		
		
		//猫インスタンスの年齢が不正値なので3歳に変更する 
		cat.setAge(3);
		
		//猫インスタンスの年齢が更新されたか確認する 
		System.out.println("age : "+cat.getAge());
		
		//それぞれのインスタンスのintroduceメソッドを呼ぶ 
		
		dog.introduce();
		cat.introduce();
	

	}

}
