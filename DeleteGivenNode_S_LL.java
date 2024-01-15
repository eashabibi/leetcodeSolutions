/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // Cannot delete the last node or a null node
            return;
        }

        // Copy the value of the next node to the current node
        node.val = node.next.val;

        // Skip the next node
        node.next = node.next.next; 
    }
}
