class Node{

    int data;
    Node next;
    Node back;

    Node(int data,Node next,Node back)
    {
        this.data = data;
        this.next = next;
        this.back = back;
    }
    Node(int data)
    {
        this.data = data;
    }

    public static Node createLL(int... arr)
    {
        Node head = new Node(arr[0]);
        Node tail;
        Node back;
        Node move=head,prev=head,temp;

        for(int i = 1;i<arr.length;i++)
        {
            temp = new Node(arr[i]);
            move.next=temp;
            move=move.next;
            move.back=prev;
            prev = prev.next;
        }
        return head;
    }

     public static void Travel(Node head)
    {
        Node Traversal = head;

        while(true)
        {
            
            System.out.print(Traversal.data+"\t");
            Traversal=Traversal.next;
            if(Traversal.next==null)
            {
                System.out.print(Traversal.data+"\t");
                break;
            }
        }

        System.out.println();

        while(Traversal!=null)
        {
            System.out.print(Traversal.data+"\t");
            Traversal = Traversal.back;
            if(Traversal.back==null)
            {
                System.out.print(Traversal.data+"\t");
                 break;
            }
        }
    }

public static boolean deleteElement(Node head,int element)
{
  
}

public static void main(String[] args)
{
    Node head = Node.createLL(10,20,30,40,50);
    Node.Travel(head);
    Node.deleteElement(head,50);
    
    Node.Travel(head);
}
}