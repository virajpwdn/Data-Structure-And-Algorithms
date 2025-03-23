package Abstract;

public class Son extends Parent {
    static int marks;

    static {
        marks = 50;
    }

    Son(){}

    Son(int age){
        super(age);
    }

    @Override
    void carrier(){
        System.out.println("I am going to be software developer");
    }

    @Override
    void name(){
        System.out.println("This is mukesh ambani");
    }

    // Setter
    public void setMarks(int marks){
        this.marks += marks;
    }

    @Override
    void check(){
        System.out.println("This is child class");
    }

    // getter
    public int getMarks(){
        return this.marks;
    }
}
