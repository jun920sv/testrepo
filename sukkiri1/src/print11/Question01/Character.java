package print11.Question01;

public class Character {

	protected String name;
	
    public Character(String name) {
        this.name = name;
    }
    public void attack() {
        System.out.println(name + "の攻撃！");
    }

}
