/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int pLen = preorder.length, iLen = inorder.length;
        if(pLen==0||iLen==0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        if(pLen==1)
            return root;
        int breakIndex = -1;
        for(int i=0;i<iLen;i++){
            if(inorder[i]==preorder[0]){
                breakIndex = i;
                break;
            }
        }
        int[] leftPre  = Arrays.copyOfRange(preorder,1,breakIndex+1);
        int[] leftIn   = Arrays.copyOfRange(inorder,0,breakIndex);
        int[] rightPre = Arrays.copyOfRange(preorder,breakIndex+1,pLen);
        int[] rightIn  = Arrays.copyOfRange(inorder,breakIndex+1,iLen);
        root.left = buildTree(leftPre, leftIn);
        root.right = buildTree(rightPre, rightIn);
        return root;
    }
}