package functions;

public class findproduct {
    public static int product(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String[] args) {
        int a = 3, b = 5;
        int product = product(a, b);
        System.out.println("The product of " + a + "*" + b + " is " + product);
        System.out.println(product(10, 20));
    }
}
