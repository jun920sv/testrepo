package practice13_print01;

import sukkiri1.code13.Hero;

public class Main {
	public static void main(String[] args) {

		Hero h = new Hero();
		Wizard w = new Wizard();
		Wand wand = new Wand();
	
		h.setName("sama");
		w.setHp(100);
		w.setWand(wand);
		wand.setPower(1.5);
		
		w.heal(h);
	}
}
