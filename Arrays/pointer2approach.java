package Arrays;

public class pointer2approach {
    public static void main(String[] args) {
        int num1[] = { 1, 2, 3, 4 };
        int num2[] = { 2, 5, 7 };
        int m = num1.length;
        int n = num2.length;
        int ans[] = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < num1.length && j < num2.length) {

            if (num1[i] > num2[j]) {
                ans[k] = num2[j];
                k++;
                j++;
            } else {
                ans[k] = num1[i];
                k++;
                i++;
            }
        }

        while (i < num1.length) {

            ans[k] = num1[i];
            k++;
            i++;

        }

        while (j < num2.length) {

            ans[k] = num2[j];
            k++;
            j++;

        }

        for (int l = 0; l < ans.length; l++) {
            System.out.print(ans[l]);
        }
        System.out.println();
    }
}
