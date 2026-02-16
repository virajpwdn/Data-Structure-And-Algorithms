class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            twoSum(nums, i, ans);
        }
        return ans;
    }

    public void twoSum(int nums[], int x, List<List<Integer>> ans) {
        int j = x+1;
        int k = nums.length-1;
        while(j < k) {
            int sum = nums[x] + nums[j] + nums[k];
            if(sum < 0) {
                j++;
            }else if(sum > 0) {
                k--;
            }else {
                ans.add(Arrays.asList(nums[x], nums[j], nums[k]));
                j++;
                k--;
                
                while(j < k && nums[j] == nums[j-1]) j++;
                while(j < k && nums[k] == nums[k+1]) k--;
            }
        }
        return;
    }
}
