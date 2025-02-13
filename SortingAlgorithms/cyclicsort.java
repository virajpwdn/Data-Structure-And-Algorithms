package SortingAlgorithms;

import java.util.Arrays;

public class cyclicsort {
    public static void cyclicSorting(int arr[]){
        // for (int i = 0; i < arr.length; i++) {
        //     int currElement = arr[i] - 1;
        //     while (arr[currElement] != arr[i]) {
        //         int temp = arr[i];
        //         arr[i] = arr[currElement];
        //         arr[currElement] = temp;
        //     }
        // }
        int i =0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 2, 1, 4, 3 };
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
