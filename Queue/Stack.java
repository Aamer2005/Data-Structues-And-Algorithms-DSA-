class Stack{

    private Integer[] array = new Integer[10];
    private  int top=-1;

    public void push(int element)
    {
        if(top==array.length-1)
        {
            System.out.println("Stack OverFlow !!!");
        }
        else
        {
            top = top+1;
            array[top] = element;
        }
    }
    public int pop()
    {
        Integer element;
        if(top==-1)
        {
            System.out.println("Stack UnderFlow !!!");
            return -1;
        }
        else{
            element = array[top];
            array[top] = null;
            top=top-1;
            return element;
        }
    }

    public int getTopElement()
    {
        if(top==-1)
        {
            System.out.println("Stack is UnderFlow!!!");
            return -1;
        }
        else
        {
            return array[top];
        }
    }    

    public int sizeOfStack()
    {
        return top+1;
    }
}

class Main{
public static void main(String[] args)
{
    Stack stack = new Stack();
    stack.push(100);
    stack.push(200);
    stack.push(300);
    System.out.println(stack.getTopElement());
    stack.pop();
    System.out.println(stack.getTopElement());
    stack.pop();
    System.out.println(stack.getTopElement());
    stack.pop();
    stack.pop();
}
}