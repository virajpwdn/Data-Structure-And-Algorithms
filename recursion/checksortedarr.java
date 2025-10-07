package recursion;

public class checksortedarr {

    public static boolean isSortedArray(int arr[], int n, int i, int j) {
        if (j == n) {
            return true;
        }

        if (arr[i] > arr[j]) {
            return false;
        } 

        return isSortedArray(arr, n, i+1, j+1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 4 };
        int i = 0;
        int j = 1;
        int n = arr.length;
        System.out.println(isSortedArray(arr, n, i, j));
    }
}
