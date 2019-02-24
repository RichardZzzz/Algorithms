/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] ret = {-1,-1};
        if(len==0 || nums[0]>target || nums[len-1]<target){
            return ret;
        }
        else{
            int index = 0; boolean first = true, found = false;
            while(index<len && nums[index]<=target){
                if(nums[index]==target && first){
                    ret[0] = index;
                    first = false;
                    found = true;
                }
                index++;
            }
            if(!found)
                return ret;
            ret[1] = index-1;
            return ret;
        }
    }
}