public class revision {

    public static void print(int n) {
        if(n==0) {
            System.out.println(n);
            return;
        }

        print(n-1);
        System.out.println(n);
    }

    public static int sum(int n) {
        if(n==1) return 1;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}