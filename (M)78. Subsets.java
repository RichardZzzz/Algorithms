/**
 * 
Given a set of distinct integers, nums, return all possible subsets (the power set).

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
    public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> list = new ArrayList();
//         backTrack(list, new ArrayList(), nums, 0);
//         return list;
//     }

//     private void backTrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums, int start){
//         list.add(new ArrayList(temp));
//         for(int i=start; i<nums.length; i++){
//             temp.add(nums[i]);
//             backTrack(list, temp, nums, i+1);
//             // remove last element
//             temp.remove(temp.size()-1);
//         }
//     }
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