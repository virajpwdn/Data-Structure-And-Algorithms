package Inheritance;

import Bank.Credit;

public class Car extends Credit {k
    String name;
    int price;
    int speed;

    Car(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }
    
}
