/**
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list, 0);
        return list;
    }
    
    public void helper(TreeNode node, List<Integer> list, int height){
        if(node == null)
            return;
        if(list.size()==height)
            list.add(node.val);
        helper(node.right, list, height+1);
        helper(node.left, list, height+1);
    }
}