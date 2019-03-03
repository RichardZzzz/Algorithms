import java.util.HashMap;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Your algorithm should run in O(n) complexity.

Example:

Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
    
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int num: nums) 
            set.add(num);
        int max = 1;
        for(int num: nums) {
            if(set.remove(num)) {//num hasn't been visited
                int val = num;
                int sum = 1;
                while(set.remove(val-1)) 
                    val--;
                sum += num - val;
                
                val = num;
                while(set.remove(val+1)) 
                    val++;
                sum += val - num;
                
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}