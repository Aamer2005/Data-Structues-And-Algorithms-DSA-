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
    public ListNode reverseList(ListNode head) {

        ListNode move = head;

        ListNode temp = null;
        ListNode prev = null;

        while(move!=null)
        {
            temp = move.next;
            move.next = prev;
            prev = move;
            move = temp;
        }

        return prev;
        
    }
}