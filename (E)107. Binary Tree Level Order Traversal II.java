/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        helper(list, root, 0);
        return list;
    }
    
    public void helper(List<List<Integer>> list, TreeNode root, int height) {
        if(root==null)
            return;
        if(height>=list.size())
            list.add(0,new ArrayList<Integer>());
        list.get(list.size()-height-1).add(root.val);
        helper(list, root.left, height+1);
        helper(list, root.right, height+1);
    }
}