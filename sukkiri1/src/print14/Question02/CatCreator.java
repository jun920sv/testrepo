package print14.Question02;

public class CatCreator extends AnimalCreator {
    public Animal createAnimal() {
        return new Cat();
    }
}