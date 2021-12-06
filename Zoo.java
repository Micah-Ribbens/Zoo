import java.util.ArrayList;
Hello

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void attractCustomers() {
        for (Animal animal : animals) {
            animal.eat();
            animal.makeNoise();
        }
    }
}