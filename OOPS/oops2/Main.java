package oops2;

import oops2.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        // Human ahan = new Human("Ahah", 18, 2000000);
        // Human shanaya = new Human("Shanaya", 19, 1800000);
        // System.out.println(ahan.name);
        // System.out.println(Human.population);

        // Person ram = new Person("ram", 2500000, 20);

        // Person ramesh = new Person("Ramesh", 5000000, 22);
        
        // System.out.println(ramesh);

        Singleton newObj = Singleton.getInstance();
        Singleton newObj2 = Singleton.getInstance();
    }
}
