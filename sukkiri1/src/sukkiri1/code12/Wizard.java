package sukkiri1.code12;

public class Wizard extends Character implements Life {
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に３ポイントのダメージ");
		m.hp -= 3;

	}
	public void fireball(Matango m) {
	    System.out.println("炎の魔法！");
	    m.hp -= 20;
	}
	

}
