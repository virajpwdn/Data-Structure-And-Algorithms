class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // In java above are two ways to make a PQ maxHeap bydefault in java it is minHeap but in c++ its maxHeap by default
	for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);
        }

        int temp = 0;
        while(k > 0) {
            temp = pq.poll();
            k--;
        }

        return temp;
    }
}
