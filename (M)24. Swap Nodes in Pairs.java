/**
 * Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.


Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    // Iterative solution
    public ListNode swapPairs(ListNode head) {
        ListNode cursor = head;
        int temp = 0;
        while(true)
        {
            if(cursor==null)
                return head;
            else if(cursor.next==null)
                return head;
            else if(cursor.next.next==null)
            {
                temp = cursor.next.val;
                cursor.next.val = cursor.val;
                cursor.val = temp;
                return head;
            }
            else
            {
                temp = cursor.next.val;
                cursor.next.val = cursor.val;
                cursor.val = temp;
                cursor=cursor.next.next;
            }
        }
    }
//------------------------------------------------------------
    // Recurive solution
    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
}