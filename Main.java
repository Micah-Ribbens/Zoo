public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog());
        zoo.addAnimal(new FancyDog());
        zoo.addAnimal(new LittleDog());
        zoo.attractCustomers();
    }
}
