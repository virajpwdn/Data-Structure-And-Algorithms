public class booleanpattern {
    public static void main(String[] args) {
        int n = 5;
        int num1 = 1;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(num1 + " ");
                } else {
                    System.out.print(num2 + " ");
                }
            }
            System.out.println();
        }
    }
}
