/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// if to return that node value at which cycle forming//
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast)
            return -1;
        ListNode p=head;
        while(p!=slow){
            p=p.next;
            s=s.next;
        }
        return p;
        
    }
}

// just to return true if cycle forms

