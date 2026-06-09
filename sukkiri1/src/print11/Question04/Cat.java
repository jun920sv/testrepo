package print11.Question04;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
		
	}
	
	public void scratch() {
		System.out.println(super.name+"はひっかいた");
	}

}
