package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car("Audi R8", 50, 200);

        Sportscar car1 = new Sportscar("sports", 10000, 280, "Ferrari");

        Car car5 = new Sportscar("Luxury", 1000000000, 200, "Rolls Royce");

        // System.out.println(car5.name);
        
    }
}
