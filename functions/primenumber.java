package functions;

public class primenumber {
    public static boolean prime(int n) {
        boolean check = true;
        if (n == 1) {
            System.out.println("Number is not prime");
        }
        if (n == 2) {
            System.out.println("Number is prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            return true;
        } else {
            return false;
        }
    }

    
    public static void printInRange(int n){
        String str = "";
        for(int i=2; i<=n; i++){
            if (prime(i) == true) {
                str+=i + " ";
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        int n = 100;
        printInRange(n); 
    }
}