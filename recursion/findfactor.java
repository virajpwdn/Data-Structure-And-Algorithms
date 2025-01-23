package recursion;

public class findfactor {
    public static void factors(int n, int i) {
        if (i > Math.sqrt(n)) {
            // System.out.print(n);
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
        }
        factors(n, i + 1);
        if (n % i == 0 && i != n / i) {
            System.out.println(n / i);
        }
    }

    public static void main(String[] args) {
        int n = 36;
        int i = 1;
        // int nsq = Math.sqrt(n);
        factors(n, i);
    }
}
