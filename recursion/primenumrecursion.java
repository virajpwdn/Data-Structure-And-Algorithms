package recursion;

public class primenumrecursion {
    public static void isPrime(int n, int i, int count){
        if(n <= 1){
            System.out.println("Number is not prime");
            return;
        }
        
        if(n == 2){
            System.out.println("Number is Prime");
            return;
        }

        if(i == n-1){
            return;
        }

        if(n % i == 0){
            count++;
        }
    }
    public static void main(String[] args) {
        int n = 11;
        int i = 1;
        int count = 0;
    }
}
