package recursion;

public class powerofx {
    public static int powerX(int x, int n){
        if(n == 0){
            return 1;
        }

        int num = powerX(x, n-1);
        return x * num;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 8;
        System.out.println(powerX(x, n));
    }
}
