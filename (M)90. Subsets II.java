/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */

import java.util.*; 
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        list.add(new ArrayList());
        for(int n:nums){
            int size = list.size();
            for(int i=0;i<size;i++){
                List<Integer> subset = new ArrayList(list.get(i));                
                subset.add(n);
                Collections.sort(subset); 
                if(!list.contains(subset))
                list.add(subset);
            }
        }
        return list;
    }
}