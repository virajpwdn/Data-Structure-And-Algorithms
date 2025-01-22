package recursion;

public class findfactor {
    public static void factors(int n, int i) {
        if (i > Math.sqrt(n)) {
            // System.out.print(n);
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
           if(i != n/i){
            System.out.println(n/i);
           }
        }
        

        factors(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 25;
        int i = 1;
        // int nsq = Math.sqrt(n);
        factors(n, i);
    }
}
