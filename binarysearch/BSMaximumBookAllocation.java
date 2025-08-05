public class BSMaximumBookAllocation {

    public static int findPages(int[] arr, int k) {
        if (k > arr.length)
            return -1;

        int high = 0, low = 0;
        // Finding low and high points in array
        for (int i = 0; i < arr.length; i++) {
            high = high + arr[i];
            low = Math.max(low, arr[i]);
        }

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int student = 1;
            int maxPages = 0;
            for (int i = 0; i < arr.length; i++) {
                if (maxPages + arr[i] <= mid) {
                    maxPages += arr[i];
                } else {
                    maxPages = arr[i];
                    student++;
                    // break;
                }
            }

            if (student <= k) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int k = 2;
        System.out.println(findPages(arr, k));
    }
}