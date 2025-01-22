package recursion;

public class sumofnaturalnum {
    public static int sum(int n) {
        if (n == 1) {
            return n;
        }
        int totalsum = n + sum(n-1);
        return totalsum;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(sum(n));
    }
}
