/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Example:

BSTIterator iterator = new BSTIterator(root);
iterator.next();    // return 3
iterator.next();    // return 7
iterator.hasNext(); // return true
iterator.next();    // return 9
iterator.hasNext(); // return true
iterator.next();    // return 15
iterator.hasNext(); // return true
iterator.next();    // return 20
iterator.hasNext(); // return false
 

Note:

next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
You may assume that next() call will always be valid, that is, there will be at least a next smallest number in the BST when next() is called.
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
class BSTIterator1 {
    // Solution 1, using stack
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode last = stack.pop();
        TreeNode cur = last.right;
        while (cur != null) {
          stack.push(cur);
          cur = cur.left;
        }
        
        return last.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.isEmpty();
    }
}
//---------------------------------------------------------------------------------------------    
class BSTIterator2{
    // Solution 2, using ArrayList
    List<TreeNode> list;
    int cur;
    public BSTIterator(TreeNode root) {
        list = new ArrayList<TreeNode> ();
        BSTInOrder(list, root);
        cur = 0;
    }
    public void BSTInOrder(List<TreeNode> list, TreeNode node){
        if(node == null)
            return;
        BSTInOrder(list, node.left);
        list.add(node);
        BSTInOrder(list, node.right);
    }

    /** @return the next smallest number */
    public int next() {
        int ret = list.get(cur).val;
        cur++;
        return ret;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return cur < list.size();
    }
}   
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
