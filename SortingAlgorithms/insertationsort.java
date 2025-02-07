package SortingAlgorithms;

import java.util.Arrays;

// ! We dont swap values rather we shift values. Here we assume that first index element is always sorted
public class insertationsort {
    public static void main(String[] args) {
        int nums[] = {7,4,1,3,2};
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            int j = i-1;
            while (j>=0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        System.out.println(Arrays.toString(nums));
    }
}