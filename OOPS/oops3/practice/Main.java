package practice;

public class Main {
    public static void main(String[] args) {
        Laptop newLaptop = new Laptop(1000000, "OLED", 2, true, "black");
        // System.out.println(newLaptop);


        Laptop lapi2 = new Mobile(10, "OLED", 2, false, "Blue", 100);

        Laptop.square();

        
        // Mobile newMobile = new Mobile(500000, "OLED Premium", 4, false, "white", 100);

        // System.out.println(newMobile.battery);

        // Laptop lapi = new Mobile(10, "Full HD", 2, false, "black", 90);
        // lapi.area();
    }
}
