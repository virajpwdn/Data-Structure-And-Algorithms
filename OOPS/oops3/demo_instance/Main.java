package demo_instance;

public class Main {

    public static void main(String[] args) {
        Animals pet = new Lion();
        pet.sound();
        pet = new Dog();

        pet.sound();
    }
}