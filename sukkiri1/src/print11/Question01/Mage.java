package print11.Question01;

public class Mage extends Character {

	public Mage(String name) {
		super(name);
	}
	
	@Override
	public void attack() {
        System.out.println(super.name + "は魔法を使った！");
    }
}
