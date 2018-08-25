//Given a non-empty array of integers, every element appears twice except for one. Find that single one.

// Example 1:
// Input: [2,2,1]
// Output: 1

// Example 2:
// Input: [4,1,2,1,2]
// Output: 4
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums){
            // all numbers come in pair will cancel out
            result ^= i;
        }
        return result;
    }
    // INPUT	OUTPUT
    // A	B	A XOR B
    // 0	0	0
    // 0	1	1
    // 1	0	1
    // 1	1	0
}