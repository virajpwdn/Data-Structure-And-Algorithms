package Arrays;

public class reversearray {
    public static void main(String[] args) {
        int nums[] = { 1, 9, 10, 14, 2, 8 };
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j--;
            i++;
        }

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }
}
