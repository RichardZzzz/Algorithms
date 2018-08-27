//Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
// Example 1:
// Input: [2,2,3,2]
// Output: 3

// Example 2:
// Input: [0,1,0,1,0,1,99]
// Output: 99
class Solution {
    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for(int i:nums){
            one = (i ^ one) & ~two;
            two = (i ^ two) & ~one;
        }
        return one;
    }
}