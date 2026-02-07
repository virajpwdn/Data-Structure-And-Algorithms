class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int i = 0;
        int j = 0;
        int n = t.length();

        while(j < n) {
            if(i < s.length() && t.charAt(j) == s.charAt(i)) {
                i++;
                if(i == s.length()) return true;
            }
            j++;
        }

        return false;
    }
}
