class Node{
int data;
Node next;

Node(int data)
{
this.data = data;
this.next = null;
}

Node(int data,Node next)
{
this.data = data;
this.next = next;
}
}

class StackUsingLL{

static Node top=null;
static int size=0;


public static void push(int element)
{
	Node temp = new Node(element);
	temp.next = top;
	top = temp;
	size=size+1;
}

public static int pop()
{
	if(top==null)
	{
		System.out.println("Stack UnderFlow!!!");
		return -1;
	}
	size-=1;
	
	int element = top.data;
	top = top.next;
	return element;
	
}

public static int getTop()
{
	if(top!=null)
	return top.data;
	else
	return -1;
}

public static int getSize()
{
	return size;
}

public static void main(String[] args)
{
	push(10);
	push(11);
	push(12);
	System.out.println(pop());
	System.out.println(getSize());
	System.out.println(getTop());
}
}