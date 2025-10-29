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
    public ListNode swapPairs(ListNode head) {
        // base condition for 0 or 1 node
        if(head==null || head.next==null) return head;

        ListNode prev = head;
        ListNode curr = head.next;

        // Recursively swap the rest of the list starting from second.next
        prev.next = swapPairs(curr.next);
        curr.next = prev;

        return curr;
    }
}