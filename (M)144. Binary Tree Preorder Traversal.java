/**
 * Given a binary tree, return the preorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
Follow up: Recursive solution is trivial, could you do it iteratively?
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
    // recurrsive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer> ();
        if(root == null)
            return ans;
        ans.add(root.val);
        if(root.left!=null)
            ans.addAll(preorderTraversal(root.left));
        if(root.right!=null)
            ans.addAll(preorderTraversal(root.right));
        return ans;
    }
    
    // iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root!=null){
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode curr = stack.pop();
                list.add(curr.val);
                if(curr.right!=null)
                    stack.push(curr.right); 
                if(curr.left!=null)
                    stack.push(curr.left);  
            }
        }
        return list;
    }
}