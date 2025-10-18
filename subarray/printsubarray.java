package subarray;

public class printsubarray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int key = -5;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println();
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                int currCount = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    currCount++;
                    // System.out.print(sum + " ");
                }
                if (sum == key) {
                    if (maxCount < currCount) {
                        maxCount = currCount;
                    }
                }
                System.out.println();
            }
        }
        System.out.println(maxCount);
    }
}
