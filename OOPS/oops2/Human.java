package oops2;

public class Human {
    String name;
    int age;
    int salary;

    static long population;

    Human(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = age;
        Human.population += 1;
    }
}
