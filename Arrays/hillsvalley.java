package Arrays;

public class hillsvalley {

    public static int countHillValley(int[] arr) {
        int count = 0;
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (temp < arr[i] && arr[i] > arr[i + 1]) {
                count++;
                temp = arr[i];
            }
            if (temp > arr[i] && arr[i] < arr[i + 1]) {
                count++;
                temp = arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,1,6,5};
        System.out.println(countHillValley(arr));
    }
}
