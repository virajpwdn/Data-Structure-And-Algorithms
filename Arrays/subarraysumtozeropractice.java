package Arrays;

import java.util.HashMap;

public class subarraysumtozeropractice {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k)
                count++;

            int rem = sum - k;
            if (hm.containsKey(rem)) {
                count += hm.get(rem);
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);

        }

        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}
