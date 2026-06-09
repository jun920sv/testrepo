package sukkiri1.code14.code03;

public class Main {
public static void main(String[] args) {
	
	Hero h = new Hero();
	h.name="みなと";
	h.hp=100;
	System.out.println(h.toString());
}
}

class Hero{
	String name;
	int hp;
	
	public String toString() {
		return "名前:"+name+"/hp:"+hp;
	}
}