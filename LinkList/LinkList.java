class Node
{
    int data;
    Node next;

    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    public static Node convertArrayToLL(int... arr)
    {
        Node head = new Node(arr[0]);
        Node move=head;

        Node temp;
        for(int i=1;i<arr.length;i++)
        {
                temp =new Node(arr[i]);
                move.next=temp;
                move=temp;
        }

        return head;
    }

    public static void Traverse(Node head)
    {
        Node Traversal = head;

        while(true)
        {
            
            System.out.print(Traversal.data+"\t");
            Traversal=Traversal.next;
            if(Traversal.next==null)
            {
                System.out.print(Traversal.data+"\t");
                Traversal=Traversal.next;
                break;
            }
        }
    }

    public static int countElements(Node head)
    {
        Node Mover=head;
        int count=0;

        while(Mover!=null)
        {
            count++;
            Mover=Mover.next;
        }

        return count;
    }

    public static boolean checkElement(Node head,int Element)
    {
        Node temp = head;
        boolean result = false;
        while(temp!=null)
        {
            if(temp.data==Element)
            {
                result = true;
                break; 
            }
            temp = temp.next;
        }
        return result;
    }

    public static boolean deleteNode(Node head,int Element)
    {
        Node move = head;
        Node  prev = head;
        boolean result = false;

        while(move!=null)
        {
            if(Element!=move.data)
            {
                prev = move;
                move = move.next;
            }
            else
            {
                prev.next = move.next;
                result = true;
                break;
            }
        }
        return result;
    }
    
}

public class LinkList{
    public static void main(String[] args)
    {
        
        int[] array = {1,2,3,4,5};
        Node head = Node.convertArrayToLL(array);
        //System.out.println(head.next.data);

        Node.Traverse(head);
       //System.out.println(Node.countElements(head));

       //System.out.println(Node.checkElement(head,3));
       System.out.println(Node.deleteNode(head,3));
       Node.Traverse(head);

    }
}