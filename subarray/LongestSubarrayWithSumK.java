package subarray;
import java.util.*;

public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int[] arr, long k) {
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: If sum itself is equal to k, update maxLen
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: Check if (sum - k) exists in the map
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Case 3: Store the first occurrence of each prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        long k = 3;
        System.out.println("Longest subarray length with sum " + k + ": " + longestSubarrayWithSumK(arr, k));
    }
}
