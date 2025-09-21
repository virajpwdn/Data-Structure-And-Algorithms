package Inheritance;

public class Sportscar extends Car {
    String type;

    Sportscar(String type, int price, int speed, String name){
        super(name, price, speed);
        this.type = type;
    }
}
