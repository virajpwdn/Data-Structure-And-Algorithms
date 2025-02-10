package SortingAlgorithms;

import java.util.Arrays;

public class quicksort {

    public static void quick(int arr[], int start, int last) {
        if (start < last) {
            int pivotIdx = partation(arr, start, last);
            quick(arr, start, pivotIdx - 1);
            quick(arr, pivotIdx + 1, last);
        }
    }

    public static int partation(int arr[], int start, int last) {
        int pivot = arr[last];
        int i = start - 1;
        for (int j = start; j < last; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[last];
        arr[last] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 28, 8, 30, 1, 3, 5, 7, 18 };
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
