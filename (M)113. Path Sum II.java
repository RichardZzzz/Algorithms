/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
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
    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, sum, list);
        return result;
    }
    
    public void helper(TreeNode node, int sum, List<Integer> list){
        if(node==null)
            return;
        list.add(node.val);
        if(node.left==null && node.right==null && node.val==sum){
            result.add(list);
            return;
        }
        helper(node.left, sum, new ArrayList<Integer>(list));
        helper(node.right, sum, new ArrayList<Integer>(list));
    }
}