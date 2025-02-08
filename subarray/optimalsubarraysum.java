package subarray;

public class optimalsubarraysum {

    public static int optimalSubarray(int arr[], int k) {
        int maxLength = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > k) {
                sum = sum - arr[j];
                j++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }

        // int left = 0, right = 0, n = arr.length;
        // while (right < n) {
        // while (left <= right && sum > k) {
        // sum = sum - arr[left];
        // left++;
        // }

        // if (sum == k) {
        // maxLength = Math.max(maxLength, right - left + 1);
        // }
        // right++;
        // if (right < n) {
        // sum += arr[right];
        // }
        // }

        return maxLength;
        
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,1,1,1,1,3,3 };
        System.out.println(optimalSubarray(arr, 6));
    }
}
