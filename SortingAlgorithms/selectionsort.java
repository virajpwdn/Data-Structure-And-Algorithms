package SortingAlgorithms;

public class selectionsort {
    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        
        for (int i = 0; i < nums.length-1; i++) {
            int small = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[small] > nums[j]) {
                    small = j;
                }
            }
            int temp = nums[small];
            nums[small] = nums[i];
            nums[i] = temp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
