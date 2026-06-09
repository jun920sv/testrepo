package practice10_print01;

import sukkiri1.code10.Hero;

public class Main {

	public static void main(String[] args) {
		
		PoisonMatango pm = new PoisonMatango('A');
		PoisonMatango pm1 = new PoisonMatango('B');
		Hero h = new Hero(50);
		pm.attack(h);
		pm1.attack(h);
		

	}

}
