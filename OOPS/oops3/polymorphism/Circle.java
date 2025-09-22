package oops3.polymorphism;

// This is child class
public class Circle extends Shapes {
    @Override /*This is anotation */
    void area(){
        System.out.println("The area of circle is pie * r * r");
    }
}
