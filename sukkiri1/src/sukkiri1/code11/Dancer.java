package sukkiri1.code11;

public class Dancer extends Character {
	String name;
	
	public Dancer(String name){
		this.name=name;
	}
	
	public void dance() {
		System.out.println(this.name +"は踊った");
	}
	
	
	@Override
	public void attack(Matango m) {
		System.out.println(this.name+"の攻撃");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;
		
	}
	

}
