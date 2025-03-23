package Abstract;

public class Main {

    public static void main(String[] args) {
        Son son = new Son();
        son.name();

        son.age = 25;

        

        // son.setMarks(100);
        // System.out.println(son.getMarks());

        son.check();
    }
}





//  [ THis is creating an anonymous class, this is not creating object
        // Parent parent = new Parent() {
        //     @Override
        //     void carrier() {
        //         System.out.println("Business");
        //     }

        //     @Override
        //     void name() {
        //         System.out.println("Aahan");
        //     }
        // };

        // parent.name();]