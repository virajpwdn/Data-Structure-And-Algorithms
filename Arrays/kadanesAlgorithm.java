package Arrays;

import java.util.ArrayList;

public class kadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int arrStart = -1, arrEnd = -1;
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if(sum == 0) start = i;
            sum += arr[i];

            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
                arrStart = start;
                arrEnd = i;
            }
            if (sum != 0)
                list.add(arr[i]);
        }
        System.out.println(maxSum);
        System.out.println(arrStart);
        System.out.println(arrEnd);
    }
}

/*
 * int profit = 0, mini = prices[0];

        for(int i=1; i<prices.length; i++){
            int cost = prices[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return profit;
 */
