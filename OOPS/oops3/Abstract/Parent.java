package Abstract;

public abstract class Parent {
    int age;
    // abstract constructor cannot be created since no objects will be created by this class
    // cannot create static constructors

    Parent(int age){
        this.age = age;
    }

    Parent(){}

    void check(){
        System.out.println("This is parent class" + age);
    }

    abstract void carrier();
    abstract void name();
}
