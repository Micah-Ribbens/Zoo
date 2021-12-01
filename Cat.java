public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("the cat ate a fish");

    }
    @Override
    public void makeNoise() {
        System.out.println("Mewo");
        //change for the sake of change
    }
}