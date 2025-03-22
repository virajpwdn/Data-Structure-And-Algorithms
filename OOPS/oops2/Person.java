package oops2;

public class Person {
    String name;
    static int salary;
    int age;
    
    static int population;

    Person(String name, int salary, int age){
        this.name = name;
        this.age = age;
        Person.salary = salary;

        Person.population += 1;
    }

    Person(){
        
    }

    @Override
    public String toString(){
        return name;
    }
}
