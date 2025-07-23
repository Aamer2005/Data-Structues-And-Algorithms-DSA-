class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next = null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next = next;
    }
}

class QueueUsingLL
{
    static Node start,end,prev;
    static int size = 0;
    public static void push(int element)
    {
        Node temp = new Node(element);

        if(size==0)
        {
            start=temp;
            prev=start;
        }
        end = temp;
        prev.next=end;
        prev = temp;
        size=size+1;
    }

    public static int pop()
    {
        if(start==null)
        {
            return -1;
        }
        int element = start.data;
        start = start.next;
        size=size-1;
        return element;
    }

    public static int getSize()
    {
        return size;
    }

    public static void main(String... args)
    {
        push(10);
        push(11);
        push(12);
        push(13);
        push(14);
        System.out.println(getSize());
        System.out.println(pop());
        System.out.println(pop());
    }
    
}