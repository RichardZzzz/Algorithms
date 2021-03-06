/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

Example:

Input: head = 1->4->3->2->5->2, x = 3
Output: 1->2->2->4->3->5
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
    public ListNode partition(ListNode head, int x) {
        // dummy1 keeps smaller nodes, dummy2 keeps larger nodes
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);
        ListNode cur1 = dummy1, cur2 = dummy2;
        while(head!=null){
            if(head.val<x){
                cur1.next = head;
                cur1 = head;
            }
            else{
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }
        // links both lists
        cur2.next = null;
        cur1.next = dummy2.next;
        return dummy1.next;
    }
}