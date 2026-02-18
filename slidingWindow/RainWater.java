class Solution {
    public int trap(int[] height) {
        int i =1;
        int j = height.length-2;
        int n = height.length;
        int leftMaxArr[] = new int[n];
        int count = 0;
        int rightMaxArr[] = new int[n];
        leftMaxArr[0] = height[0];
        rightMaxArr[n-1] = height[n-1];

        while(i < n) {
            leftMaxArr[i] = Math.max(leftMaxArr[i-1], height[i]);
            rightMaxArr[j] = Math.max(rightMaxArr[j+1], height[j]);

            i++;
            j--;
        }

        i = j = 0;
        while(i < n) {
            int min = Math.min(leftMaxArr[i], rightMaxArr[i]);
            int sum = min - height[i];
            if(sum > 0) {
                count += sum;
            }
            i++;
        }

        return count;

    }
}
