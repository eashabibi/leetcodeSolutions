/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
         if (head == null) {
            return null;
        }

        // Remove nodes with the specified value from the beginning of the list
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the specified value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }

}
