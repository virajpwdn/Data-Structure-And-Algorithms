package oops1;

public class Student {
    String name;
    int age;
    float marks;

    Student(String name, int age, float marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    Student(){

    }

    

    public static void main(String[] args) {
        // Student 1
        Student newStudent1 = new Student();
        newStudent1.name = "Virat";
        newStudent1.age = 18;
        newStudent1.marks = 98.12f;

        System.out.println(newStudent1.name);
        System.out.println(newStudent1.age);
        System.out.println(newStudent1.marks);

        System.out.println();
        // Student 2
        Student newStudent2 = new Student();
        newStudent2.name = "alphanso";
        newStudent2.age = 12;
        newStudent2.marks = 100;

        System.out.println(newStudent2.name);
        System.out.println(newStudent2.age);
        System.out.println(newStudent2.marks);
        int num = 10;
        // creating new student and assigining details with constructor
        Student newStudent3 = new Student("phillips", 20, 96.14f);
        System.out.println(newStudent3.name);
    }
}
