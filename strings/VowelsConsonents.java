class Solution {
    public int maxFreqSum(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        int i = 0;
        while(i < s.length()) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            i++;
        }

        int maxVowels = 0;
        int maxConsonents = 0;
        for (Character ch : hm.keySet()) {
            int freq = hm.get(ch);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                maxVowels = Math.max(freq, maxVowels);
            }else {
                maxConsonents = Math.max(freq, maxConsonents);
            }
        }

        return maxVowels + maxConsonents;
    }
}
