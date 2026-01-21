class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1) return s.trim().length();

        String arr[] = s.split(" ");

        String lastWord = arr[arr.length - 1];

        String ans = lastWord.trim();

        return ans.length();
    }
}
