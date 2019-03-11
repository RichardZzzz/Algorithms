/**
 * Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        Stack<Integer> stack = new Stack<Integer>();
        ListNode cur = head;
        while(cur!=null){
            stack.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            if(stack.pop()!=cur.val)
                return false;
            cur = cur.next;
        }
        return true;
    }
}