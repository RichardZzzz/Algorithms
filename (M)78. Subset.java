import java.util.ArrayList;
import java.util.List;
/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
class Solution {
    public List<List<Integer>> subsets_Solution1(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        backTrack_Solution1(list, new ArrayList(), nums, 0);
        return list;
    }

    private void backTrack_Solution1(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums, int start){
        // add current temp into list
        list.add(new ArrayList(temp));
        for(int i=start; i<nums.length; i++){
            // add next element to temp
            temp.add(nums[i]);
            backTrack_Solution1(list, temp, nums, i+1);
            // remove last element from temp
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> subsets_Solution2 (int[] nums){
        List<List<Integer>> list = new ArrayList();
        list.add(new ArrayList());
        for(int n:nums){
            int size = list.size();
            for(int i=0;i<size;i++){
                List<Integer> subset = new ArrayList(list.get(i));
                subset.add(n);
                list.add(subset);
            }
        }
        return list;
    }
}

