package recursion;

public class primenumberloop {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false; /*Because no even number is prime */
        for (int i = 3; i < Math.sqrt(n); i+=2) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
}
