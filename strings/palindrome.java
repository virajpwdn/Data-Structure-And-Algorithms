public class palindrome {
    public static void main(String[] args) {
        String str = "noonk";
        Boolean check = true;
        
        int n = str.length()-1;
        for (char i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-i)) {
                check = false;
            }
        }
        System.out.println(check);
    }
}
