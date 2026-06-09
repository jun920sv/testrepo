package sukkiri1.code10;

public class Main {
	public static void main(String[] args) {

		SuperHero sh = new SuperHero();
		Matango m = new Matango();
	/*	Hero s = new Hero(1);
		Matango m = new Matango();
		 

		sh.attack(m);//子クラスにないから親クラスから取ってくる 実装前の話
		s.attack(m);
		sh.run();//オーバライドされてるから子クラスのrunメソッド
		s.run();//消えたわけじゃない　親のrunもある
		
		sh.fly();
		sh.attack(m);//子クラスに実装 飛んでたら２回攻撃
	*/
		
		sh.fly();
		sh.attack(m);
		
		
				
	}

}


