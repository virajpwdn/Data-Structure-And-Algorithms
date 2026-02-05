class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.add(entry);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        int ans[] = new int[pq.size()];
        for(int i=0; i<ans.length; i++) {
            ans[i] = pq.poll().getKey();
        };

        return ans;
    }
}
