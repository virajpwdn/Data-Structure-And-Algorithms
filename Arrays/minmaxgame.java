package Arrays;

public class minmaxgame {
    public int minMaxGame(int[] nums) {
        int n = nums.length - 1;
        for (int i = 0; i < n/2; i++) {
            if (n == 1) {
                return nums[i];
            } else {
                int half = n / 2;
                int newNums[] = new int[half];
                for (int j = 0; j < newNums.length; j++) {
                    if (j % 2 == 0) {
                        newNums[j] = Math.min(nums[2 * i], nums[2 * i + 1]);
                    } else {
                        newNums[j] = Math.max(nums[2 * i], nums[2 * i + 1]);
                    }
                }
            }
        }
        return nums[0];
    }
}
