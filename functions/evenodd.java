public class evenodd {
    public static boolean even(int n){
        boolean isEven;

        if(n % 2 == 0){
            return isEven = true;
        } else {
            return isEven = false;
        }
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(even(n));
    }
}
