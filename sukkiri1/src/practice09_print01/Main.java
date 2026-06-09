package practice09_print01;

public class Main {

	public static void heal(int hp){
		hp +=10;
		System.out.println(hp);
	}
	
	public static void heal(Thief a) {
		a.hp+=10;
	}
	
	public static void main(String[] args) {
		
		int baseHp=25;
		Thief t =new Thief("アサカ",baseHp);
		
		heal(baseHp);
		System.out.printf("%d:%d\n",baseHp,t.hp);
		
		
		heal(t);
		System.out.printf("%d:%d\n",baseHp,t.hp);
	}

}
