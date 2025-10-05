package recursion;

public class factorialofnumber {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factnm1 = factorial(n-1);
        int fn = n * factnm1;
        return fn;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
