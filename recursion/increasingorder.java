package recursion;

public class increasingorder {
    public static void increasing(int n, int num){
        if(num == n){
            System.out.println(n);
            return;
        }
        
        System.out.print(num + " ");
        increasing(n, num+1);
    }

    public static void main(String[] args) {
        int n = 10;
        int num = 1;
        increasing(n, num);
    }
}
