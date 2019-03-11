/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3
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
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int count) {
        inOrderTraverse(root, count);
        return result;
    }
    
    public void inOrderTraverse(TreeNode root, int k){
        if(root==null)
            return;
        inOrderTraverse(root.left, k);
        count++;
        if(k==count)
            result = root.val;
        inOrderTraverse(root.right, k);
    }
}