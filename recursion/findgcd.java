package recursion;

public class findgcd {
    public static int isGcd(int a, int b, int i){

        if(i == 0){
            return -1;
        }

        if(a%i == 0 && b%i == 0){
            return i;
        }

        return isGcd(a, b, i-1);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        int i = Math.min(a, b) ;
        System.out.println(isGcd(a, b, i));
    }
}
