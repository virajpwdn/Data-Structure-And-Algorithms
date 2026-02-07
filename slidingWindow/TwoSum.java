class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;        
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(nums[i], i);    
        }

        for(int i=0; i<n; i++) {
            int rem = target - nums[i];
            if(hm.containsKey(rem) && i != hm.get(rem)) {
                return new int[]{i, hm.get(rem)};
            }
        }

        return new int[] { -1, -1 };
    }
}
