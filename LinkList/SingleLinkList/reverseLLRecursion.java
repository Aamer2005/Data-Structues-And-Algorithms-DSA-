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

        return recursion(move,temp,prev);

    }

    public ListNode recursion(ListNode move , ListNode temp ,ListNode prev)
    {
        if(move==null)
        return prev;
        else
        {
            temp = move.next;
            move.next = prev;
            prev = move;
            move = temp;
            return recursion(move,temp,prev);
        }

    }
}