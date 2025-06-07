Palindrome Number (Integer)
Problem Statement: Check if a given integer is a palindrome (reads the same forwards and backwards).
Code:
javaclass Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        String rev = "";
        while(x > 0) {
            int lastDig = x % 10;
            rev += lastDig;
            x = x / 10;
        }
        
        return x == Integer.parseInt(rev) ? true : false;
    }
}
Algorithm Approach:

Return false immediately for negative numbers
Extract digits from right to left using modulo and division
Build reversed string by concatenating digits
Compare original with parsed reversed string

Time Complexity: O(log₁₀ n)

Where n is the input number
Loop runs for the number of digits in the input

Space Complexity: O(log₁₀ n)

String concatenation creates new string objects
Space grows with number of digits

Issue Found: ⚠️ Logic Error

After the while loop, x becomes 0
Comparing x == Integer.parseInt(rev) will always compare 0 with the reversed number
Should store original number before modifying it

Corrected Version:
javaclass Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;  // Handle zero case
        
        int original = x;  // Store original value
        String rev = "";
        while(x > 0) {
            int lastDig = x % 10;
            rev += lastDig;
            x = x / 10;
        }
        
        return original == Integer.parseInt(rev);
    }
}
Edge Cases Handled:

✅ Negative numbers (returns false)
✅ Zero (returns true - zero is a palindrome)
✅ Single digit numbers (palindromes)
✅ Multi-digit palindromes