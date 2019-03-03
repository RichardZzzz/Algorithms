/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5

Example 2:

Input: 1->1->1->2->3
Output: 2->3
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = new ListNode(0);       // initialize a dummy node with val = 0
        t.next = head;              // t->head
     
        ListNode p = t;             // p = t
        while(p.next!=null&&p.next.next!=null)  // p->next is not null, and p->next->next is not null
        {
            if(p.next.val == p.next.next.val)   // p->next == p->next->next
            {
                int dup = p.next.val;       
                while(p.next!=null&&p.next.val==dup)    // p->next is not null and p->next.val is not the same
                {
                    p.next = p.next.next;   // p->next = p->next->next
                }
            }
            else{
                p=p.next;                   // p=p->next
            }
     
        }
     
        return t.next; 
    }
}