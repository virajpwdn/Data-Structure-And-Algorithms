package SortingAlgorithms;

import java.util.Arrays;

public class mergesort {
    //! time complexity = O(n logn) -> same for worst case, best case, average case
    public static void divide(int arr[], int start, int end) {
        if (start == end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);

    }

    public static void conquer(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int k = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] < arr[idx2]) {
                temp[k] = arr[idx1];
                idx1++;
                k++;
            } else {
                temp[k] = arr[idx2];
                idx2++;
                k++;
            }
        }

        while (idx1 <= mid) {
            temp[k] = arr[idx1];
            idx1++;
            k++;
        }

        while (idx2 <= end) {
            temp[k] = arr[idx2];
            idx2++;
            k++;
        }

        for (int i = 0, j = start; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 10, 3, 8, 1 };
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
