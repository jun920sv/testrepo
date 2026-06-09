package sukkiri1.code08;

public class Main {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		h.name="minato";
		h.hp=100;
		System.out.printf("勇者%sを生み出しました\n",h.name);
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();

	}

}
