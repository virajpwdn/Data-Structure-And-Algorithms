package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Media newCar = new Car();
        // newCar.start();

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.upgradeEngine(); 
        car1.start();
    }
}
