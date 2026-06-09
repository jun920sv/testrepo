package print14.Question02;

public abstract class AnimalCreator {
	
	public abstract Animal createAnimal();
	
	public void introduce() {
		Animal animal = createAnimal();
		animal.speak();
	}
	

}
