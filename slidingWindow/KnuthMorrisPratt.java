class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;
        int lps[] = new int[needle.length()];
        lps[0] = 0;

        int i = 0, j = 1, n = haystack.length(), m = needle.length();

        while (j < m) {
            if (needle.charAt(i) == needle.charAt(j)) {
                lps[j] = i + 1;
                i++;
                j++;
            } else {
                if (i == 0) {
                    lps[j] = 0;
                    j++;
                } else
                    i = lps[i - 1];
            }
        }

        i = j = 0;
        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lps[j - 1];
                }
            }
            if (j == m)
                return (i - m);
        }

        return -1;
    }
}
