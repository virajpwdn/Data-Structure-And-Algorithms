package recursion;

public class friendspairing {
    public static int pairing(int n){
        if(n == 1 || n == 2) {
            return n;
        }

        // if(n == 2) return 2;
        // int fnm1 = pairing(n-1);
        // int fnm2 = fnm1 * pairing(n-2);
        // int totalways = fnm1 + fnm2;

        return pairing(n-1) + (n-1) * pairing(n-2);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(pairing(n));
    }
}
