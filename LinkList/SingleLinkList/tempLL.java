class Node{

    String data;
    Node next;

    Node(String data,Node next)
    {
        this.data=data;
        this.next = next;
    }
    Node(String data)
    {
        this.data = data;
        next = null;
    }

    public static Node createLinklist(String... array)
    {
        
        Node head = new Node(array[0]);
        Node move=head,temp;

        for(int i=1;i<array.length;i++)
        {
            temp = new Node(array[i]);
            move.next = temp;
            move = move.next;
        }
        
        return head;
    }

    public static void TravelLL(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+"\t");
            head = head.next;
        }
        System.out.println();
    }

    public static Node deleteFirstNode(Node head)
    {
        if(head==null)
        {
            return null;
        }
        else
        {
            head = head.next;
        }
        return head;
    }

    public static void deleteKthElement(Node head,int k)
    {
        int count = 1;

        if(head!=null)
        {
            Node move = head;
            Node prev = head;

            while(move!=null)
            {
                if(count==k)
                {
                    prev.next  = move.next;
                    break;
                }

                count++;
                prev = move;
                move=move.next;

            }
        }
        

    }

    public static Node InsertAtFirst(Node head)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter data to insert at first : ");
        String data = sc.nextLine();

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }
    public static void insertAtGivenPosition(Node head,String data,int position)
    {
        Node newNode = new Node(data);
        Node move= head;
        int count=1;
        while(move!=null)
        {
            if(count==position)
            {
                newNode.next=move.next;
                move.next=newNode;
                break;
            }
            move=move.next;
            count++;
        }
    }

    public static void main(String... args)
    {
       Node head = createLinklist("10","20","30","40","50");
        TravelLL(head);
        insertAtGivenPosition(head,"25",2);
        TravelLL(head);
    }
}