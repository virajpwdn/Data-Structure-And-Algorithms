package practice;

public class Laptop {
    int price;
    String display;
    int speakerCount;
    boolean isKeyboard;
    String color;

    @Override
    public String toString() {
        // TODO It only accepts strings
        return Integer.toString(price);
    }

     void area(){
        System.out.println("This is area of laptop");
    }

    static void square(){
        System.out.println("This is square from laptop class");
    }

    Laptop(int price, String display, int speakerCount, boolean isKeyboard, String color){
        this.price = price;
        this.display = display;
        this.speakerCount = speakerCount;
        this.isKeyboard = isKeyboard;
        this.color = color;
    }    
}
