Reverse Integer
Problem Statement: Reverse the digits of a 32-bit signed integer. Return 0 if the reversed integer overflows.
Code:
javapublic class Solution {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE) return 0;
        
        long rev = 0;
        int n = Math.abs(x);
        
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n /= 10;
        }
        
        if (rev > Integer.MAX_VALUE) return 0;
        
        return x < 0 ? (int)-rev : (int)rev;
    }
}
Algorithm Approach:

Handle special case: Integer.MIN_VALUE (-2³¹) cannot be safely converted to positive
Use long to store reversed number to detect overflow
Work with absolute value to simplify logic
Extract digits using modulo and division operations
Check if reversed number exceeds Integer.MAX_VALUE (2³¹-1)
Return negative result if original was negative

Time Complexity: O(log₁₀ n)

Where n is the absolute value of input
Loop runs for the number of digits in the input

Space Complexity: O(1)

Uses only constant extra space (variables: rev, n, last)
No additional data structures used

Edge Cases Handled:

✅ Integer.MIN_VALUE (-2,147,483,648) returns 0
✅ Overflow detection (when reversed > 2,147,483,647)
✅ Negative numbers (preserves sign)
✅ Single digit numbers
✅ Numbers with trailing zeros (become leading zeros, get removed)
