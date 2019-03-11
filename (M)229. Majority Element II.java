/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Note: The algorithm should run in linear time and in O(1) space.

Example 1:

Input: [3,2,3]
Output: [3]

Example 2:

Input: [1,1,1,3,3,2,2,2]
Output: [1,2]
 */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int cd1 = 0, cd2 = 0, count1 = 0, count2 = 0;
        for(int number : nums){
            if(cd1 == number)
                count1++;
            else if(cd2 == number)
                count2++;
            else if(count1 == 0){
                cd1 = number;
                count1++;
            }
            else if(count2 == 0){
                cd2 = number;
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        
        for(int number : nums){
            if(cd1 == number)
                count1++;
            if(cd2 == number)
                count2++;
        }

        if(count1 > (nums.length / 3))
            list.add(cd1);
        if(count2 > (nums.length/3) && cd1 != cd2)
            list.add(cd2);
        
        return list;
    }
}