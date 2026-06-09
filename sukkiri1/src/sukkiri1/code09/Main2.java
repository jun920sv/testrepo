package sukkiri1.code09;

public class Main2 {
	public static void main(String[] args) {
		
		Sword s = new Sword();
		s.name ="炎の剣";
		s.damege=10;
		Hero h = new Hero("湊");
		h.name="みなと";
		h.hp=100;
		h.sword =s;
		System.out.printf("現在の武器は%s",h.sword.name);
		/*
		 * Hero h = new Hero()
		 * h.sword =s;
		 * 
		 * Sword s = new Sword();
		 * s.name
		 */

	}

}
