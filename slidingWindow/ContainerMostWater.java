class Solution {
    public int maxArea(int[] arr) {
        int i = 0, j = arr.length-1, maxLength = 0;

        while(i < j) {
            int minHeight = Math.min(arr[i], arr[j]);
            int area = minHeight * (j - i);
            maxLength = Math.max(area, maxLength);

            if(arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxLength;
    }
}
