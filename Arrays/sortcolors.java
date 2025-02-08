package Arrays;

import java.util.Arrays;

public class sortcolors {
    public static void sortColors(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);
    }
}
