package oops2.singleton;

public class Singleton {
    private String name;

    public static Singleton instance;

    private Singleton(){
        System.out.println("Hello world");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }


        return instance;
    }
}

// Multi-Level Inheritance is not supported in java
