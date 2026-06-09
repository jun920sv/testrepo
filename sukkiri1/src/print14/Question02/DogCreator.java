package print14.Question02;

public class DogCreator extends AnimalCreator{

	@Override
	public  Animal createAnimal() {
		return new Dog();
		
	}

}
