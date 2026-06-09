package sukkiri1.code08;

public class Main2 {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp=50;
		m1.suffix ='A';
		
		Matango m2 = new Matango();
		m1.hp=48;
		m1.suffix ='B';
		
		h.sleep();
		m1.run();
		m2.run();
		h.run();
		
	}
}
