package practice08_print01;

public class Main {

	public static void main(String[] args) {
		
		Cleric c = new Cleric();
		c.selfAid();
		System.out.println("MP:"+c.pray(13));

	}

}
