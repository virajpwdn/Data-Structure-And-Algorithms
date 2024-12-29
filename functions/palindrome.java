public class palindrome {
    public static boolean palin(int n){
        boolean isPalindrome;
        int check = n;
        String output = "";
        
        while (n != 0) {
            int lastDigit = n % 10;
            output = output + lastDigit;
            n = n / 10;
        }

        if (check == Integer.parseInt(output)) {
            return isPalindrome = true;
        } else {
            return isPalindrome = false;
        }
    }
    public static void main(String[] args) {
        int n = 12121;
        System.out.println(palin(n));
    }
}
