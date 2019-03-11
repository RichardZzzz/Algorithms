/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
class Solution {
    public int[] productExceptSelf(int[] arr) {
        int len = arr.length;
	    int[] arr1 = new int[len];
	    arr1[0] = 1;
	    
	    for(int i=1;i<len;i++){
	        arr1[i] = arr1[i-1]*arr[i-1];
        }
        int temp = 1;
	    for(int i=1;i<len;i++){
            arr1[len-i] *= temp;
            temp *= arr[len-i];
	    }
	    return arr1;
    }
}