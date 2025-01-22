package recursion;

public class decendingorder {
    public static void decending(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        decending(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        decending(n);
    }
}