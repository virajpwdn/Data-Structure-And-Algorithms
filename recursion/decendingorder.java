package recursion;

public class decendingorder {
    public static void decending(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        decending(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        decending(n);
    }
}