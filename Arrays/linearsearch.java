package Arrays;

public class linearsearch {

    public static void findTar(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 16;
        findTar(arr, key);
    }
}
