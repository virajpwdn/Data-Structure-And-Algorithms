class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int n = s.length();
        int maxCount = 1;
        HashSet<Character> set = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         if (!set.contains(s.charAt(j))) {
        //             set.add(s.charAt(j));
        //         } else {
        //             break;
        //         }
        //     }
        //     int count = set.size();
        //     maxCount = Math.max(maxCount, count);
        //     set.clear();
        // }
        int i = 0;
        int j = 0;
        while(i < n) {
            if(j<n && !set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
            }else {
                maxCount = Math.max(maxCount, set.size());
                i++;
                j = i;
                set.clear();
            }
        }
        return maxCount;
    }
}
