package recursion;
// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
public class recursionpairing {
    public static int totways(int n){
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = totways(n-1);
        int fnm2 = totways(n-2);
        int total = fnm1 + (fnm1 * fnm2);

        return total;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(totways(n));
    }
}
