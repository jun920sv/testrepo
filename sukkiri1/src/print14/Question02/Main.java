package print14.Question02;

public class Main {

	public static void main(String[] args) {
		AnimalCreator creator1 = new DogCreator();
		creator1.introduce();

		AnimalCreator creator2 = new CatCreator();
		creator2.introduce();
}

}
