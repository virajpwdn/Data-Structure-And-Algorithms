package oops3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();

        // Here method got override, in Shape class area method is present and in Circle class also area method is present. when we created new object of parent with child class the data of child class was stored inside of heap memory and Shapes circle is pointing towards it here because the names of the methods were that's why the method got override means the area in shape class got override with child class. In case if the methods name did not match then it would have pritend data of area which was in parent class. Because the circle is of Shapes data type it does not know anything about its child but child know everything about parent. So the flow is upwards.
        circle.area();
    }
}
