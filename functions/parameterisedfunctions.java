package functions;

import java.util.Scanner;

public class parameterisedfunctions {

    public static int parameter(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("the sum of numbers is " +parameter(num1, num2));
    }
}
  