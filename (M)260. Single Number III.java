
/**
 * Given an array of numbers nums, in which exactly two elements appear only
 * once and all the other elements appear exactly twice. Find the two elements
 * that appear only once.
 * 
 * Example:
 * 
 * Input: [1,2,1,3,2,5] Output: [3,5]
 * 
 * Note:
 * 
 * The order of the result is not important. So in the above example, [5, 3] is
 * also correct. Your algorithm should run in linear runtime complexity. Could
 * you implement it using only constant space complexity?
 */
import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            Integer times = map.get(i);
            map.put(i, times == null ? 1 : times + 1);
        }
        int[] res = new int[2];
        int i = 0;
        for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue().equals(1)) {
                res[i ++] = e.getKey();
            }
        }
        return res;
    }
}