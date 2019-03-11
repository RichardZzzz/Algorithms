/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2

Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

 */
class Solution {
    public int missingNumber(int[] nums) {
		int sumRange = 0;
		for(int i=1; i<=nums.length; i++) {
			sumRange ^= i;
		}
		int sumArr = 0;
		for(int i = 0; i<nums.length; i++ ) {
			sumArr ^= nums[i];
		}
		return sumRange ^ sumArr;
    }
}