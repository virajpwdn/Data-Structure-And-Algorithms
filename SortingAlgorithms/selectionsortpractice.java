package SortingAlgorithms;

import java.util.Arrays;

public class selectionsortpractice {
    public static void main(String[] args) {
        int arr[] = {7,4,5,1,2,6,9};

        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
