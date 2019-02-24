/**
 * 
Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3

Example 2:

Input: [3,4,-1,1]
Output: 2

Example 3:

Input: [7,8,9,11,12]
Output: 1
 */
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        if(len==0)
            return 1;
        for(int i=0;i<len;i++)
            map.put(nums[i],i);
        for(int i=1;i<=len;i++){
            if(map.get(i)==null)
                return i;
        }
        return len+1;

    }
}