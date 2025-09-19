# Problems Solved

### 1. Count Digits in a Number

**Problem Statement:** Count the number of digits in a given integer (handles negative numbers by taking absolute value).

**Code:**
```javascript
function countNum(num) {
    if (num == 0) return 1;
    if (num < 0) num = Math.abs(num);
    let count = 0;
    while (Math.floor(num) > 0) {
        count++;
        num = num / 10;
    }
    return count;
}

// Test case
let tot = countNum(259129);
console.log(tot); // Output: 6
```

**Algorithm Approach:**
- Handle edge case: if number is 0, return 1
- Convert negative numbers to positive using `Math.abs()`
- Use division by 10 in a loop to remove digits one by one
- Count iterations until no digits remain

**Time Complexity:** O(log₁₀ n)
- Where n is the input number
- We divide by 10 in each iteration, so the number of iterations is proportional to the number of digits
- Number of digits in n is ⌊log₁₀ n⌋ + 1

**Space Complexity:** O(1)
- Uses only a constant amount of extra space (variables: count, num)
- No additional data structures used

**Edge Cases Handled:**
- ✅ Zero input (returns 1)
- ✅ Negative numbers (converts to positive)
- ✅ Single digit numbers
- ✅ Multi-digit numbers