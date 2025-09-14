/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        
        Node first = head;
        Node last = head;
        
        while(last.next!=null)
        {
            last = last.next;
        }
        
        head = last;
        
        Node temp = null;
        Node move = head;
        
        while(move!=null)
        {
            temp = move.prev;
            move.prev = move.next;
            move.next = temp;
            move = move.next;
        }
        
        return head;
    }
}