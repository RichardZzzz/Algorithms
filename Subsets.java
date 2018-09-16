import java.util.ArrayList;

// 78 Medium
// Given a set of distinct integers, nums, return all possible subsets (the power set).
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        backTrack(list, new ArrayList(), nums, 0);
        return list;
    }

    private void backTrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums, int start){
        // add current temp into list
        list.add(new ArrayList(temp));
        for(int i=start; i<nums.length; i++){
            // add next element to temp
            temp.add(nums[i]);
            backTrack(list, temp, nums, i+1);
            // remove last element from temp
            temp.remove(temp.size()-1);
        }
    }
}