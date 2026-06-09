package practice10_print01;

import sukkiri1.code10.Hero;

public class PoisonMatango extends Matango {

	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);

	}
	@Override
	public void attack(Hero h) {
		super.attack(h);

		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた!");
			int dmg =h.hp / 5;
			h.hp-=dmg;
			System.out.println(dmg + "のダメージ！");
			this.poisonCount--;
			System.out.println("HeroのHP:"+h.hp);
		}

	}
}