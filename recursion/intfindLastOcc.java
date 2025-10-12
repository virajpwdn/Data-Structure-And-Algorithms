package recursion;

public class intfindLastOcc {
    public static int lastOccur(int arr[], int target, int i) {
        
        if (i == 0) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }

        return lastOccur(arr, target, i - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 9, 12 };
        int target = 5;
        int i = arr.length - 1;
        System.out.println(lastOccur(arr, target, i));
    }
}
