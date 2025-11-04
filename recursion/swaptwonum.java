package recursion;

public class swaptwonum {

    public static void swapnum(int n){
        if(n == 0) return;

        swapnum(n-1);
        System.out.println(n);
        return;
    }

    public static void main(String[] args) {
        int n = 10;
        swapnum(n);
    }
}
