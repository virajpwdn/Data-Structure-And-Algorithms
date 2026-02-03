class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++) {  //Time Complexity = O(n);
            pq.add(nums[i]); // Time Complexity = O(log k)

            if(pq.size() > k) {
                pq.poll(); // Time Complexity = O(log k)
            }
        }

        return pq.peek();
    }
    // Time Complexity = O(n) * (O(log k) + O(log k)) === O(n logk)
}
