package print11.Question04;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}
	
	public void bark() {
		System.out.println(super.name+"はワン！と吠えた");
	}

}
