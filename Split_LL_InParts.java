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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int L = 0;
        while (curr != null) {
            L = L + 1;
            curr = curr.next;
        }
        int buclen = L / k;
        int rem = L % k;
        List<ListNode> result = new ArrayList<>(k);
        curr = head;
        ListNode prev = null;
        for (int i = 0; i < k; i++) {
            result.add(curr);
            for (int count = 1; count <= buclen + (rem > 0 ? 1 : 0); count++) {
                prev = curr;
                curr = curr.next;
            }
            if (prev != null) {
                prev.next = null;
            }
            rem--;
        }
        return result.toArray(new ListNode[0]);
    }
}
