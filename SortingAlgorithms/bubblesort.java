package SortingAlgorithms;

public class bubblesort {
    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 }; 
        int swap = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }

        if (swap == 0) {
            System.out.println("Array is already sorted! " + swap);
        } else {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }

    }
}
