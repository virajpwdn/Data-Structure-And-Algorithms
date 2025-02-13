package SortingAlgorithms;

import java.util.Arrays;

public class quicksort {
// Quick sort works on the priniciple of Piviot and Partition -> left side pivout se chote aur right side mai bade elements; 
// Use quick sort when time is not a concern but space is
// Use merge sort when time is concern and space is not
    public static void quick(int arr[], int start, int last) {
        if (start < last) {
            int pivotIdx = partation(arr, start, last);
            quick(arr, start, pivotIdx - 1);
            quick(arr, pivotIdx + 1, last);
        }
    }

    public static int partation(int arr[], int start, int last) {
        // i index jo hai that will make place for pivot and j pointer will compare elements with pivot
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
