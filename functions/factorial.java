package functions;

public class factorial {
    public static int fact(int n){
        int output = 1;
        for(int i=1; i<=n; i++){
            output *= i;
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 5;
        int factorial = fact(n);
        System.out.println(factorial);
    }
}
