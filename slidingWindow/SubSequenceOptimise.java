class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;

        HashMap<Character, Integer> hm = new HashMap<>();
        int j = 0, i = 0, n = s.length(), maxCount = 0;

        while (j < n) {
            char ch = s.charAt(j);
            if (hm.containsKey(ch)) {
                i = Math.max(i, hm.get(ch) + 1);
                // hm.remove(ch);
            }
            hm.put(ch, j);
            maxCount = Math.max(maxCount, (j - i) + 1);
            j++;

        }
        // maxCount = Math.max(maxCount, (j-i));
        return maxCount;
    }
}
