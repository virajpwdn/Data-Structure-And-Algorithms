package practice;

public class Mobile extends Laptop {
    int battery;

    void area(){
        System.out.println("This is area of mobile");
    }

    // @Override
    static void square(){
        System.out.println("This is square from mobile class");
    }
    
    Mobile(int price, String display, int speakerCount, boolean isKeyboard, String color, int battery) {
        super(price, display, speakerCount, isKeyboard, color);
        this.battery = battery;
    }
}
