package sukkiri1.code09;

public class Main3 {

	public static void main(String[] args) {
		Hero h = new Hero("みなと");
		//Hero h4 = new Hero();
		h.name="みなと";
		h.hp=100;
		Hero h2 = new Hero("あさか");
		h2.name ="アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name ="すがわら";
		w.hp=50;
		w.heal(h);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h.hp);
		System.out.println(h2.hp);
		
	}

}
