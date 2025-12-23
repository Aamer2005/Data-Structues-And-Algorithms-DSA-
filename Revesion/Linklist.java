class Node{
Integer data ;
Node next;

Node(Integer data)
{
    this.data = data;
}

Node(Integer data , Node next)
{
    this.data = data;
    this.next = next;
}

public static Node createLL(int... elements)
{
    Node head = new Node(elements[0]);

    Node move = head;
    Node temp;

    for(int i=1;i<elements.length;i++)
    {
        temp = new Node(elements[i]);
        move.next = temp;
        move = move.next;
    }

    return head;

}
}

class LL{

public static void main(String[] args)
{
    Node head = Node.createLL(1,2,3,4,5);
    System.out.println(head.data);  
    System.out.println(head.next.data);
}

}