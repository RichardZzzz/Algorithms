/**
 * Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Return 0 if the array contains less than 2 elements.

Example 1:

Input: [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either
             (3,6) or (6,9) has the maximum difference 3.
Example 2:

Input: [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
Note:

You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
Try to solve it in linear time/space.
 */
class Solution {
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if(len<2)
            return 0;
        sort(nums, 0, len-1);        
        int max = 0;
        for(int i=1;i<len;i++){
            if(abs(nums[i-1]-nums[i]) > max)
                max = abs(nums[i-1]-nums[i]);
        }
        return max;
    }
    
    private int abs(int n){
        if(n >= 0)
            return n;
        else
            return n*(-1);
    } 
}