class KthLargest {
    PriorityQueue<Integer> pq;
    int j = 0;
    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<>();
        j = k;
        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);

            if(pq.size() > k) {
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > j) pq.poll();
        
        return pq.peek();
    }
}

