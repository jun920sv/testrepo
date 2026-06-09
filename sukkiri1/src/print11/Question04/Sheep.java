package print11.Question04;

public class Sheep extends Animal{

	public Sheep(String name) {
		super(name);
		
	}

	public void bleat() {
		System.out.println(super.name+"はメェーと鳴いた");
	}
}
