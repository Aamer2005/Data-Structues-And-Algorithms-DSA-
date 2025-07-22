class MinStack
{

    private int top=-1;
    private int size=10;
    private Integer[] array=new Integer[size];
    private int currentSize=0;

    Stack<Integer> tempStack = new Stack<>();

    public MinStack() {
        
    }

    public void push(int val) {
        if(top==size-1)
        System.out.println("Stack OverFlow");
        else
        {
            if(tempStack.isEmpty() )
            tempStack.push(val);
            else if(tempStack.peek()>=val)
            {
                tempStack.push(val);
            }

            top=top+1;
            array[top] = val;
            currentSize+=1;
        }
   
    }

    public void pop() {
        if(top==-1)
        System.out.println("Stack Underflow");
        else
        {
            if(array[top].equals(tempStack.peek()))
            {
                tempStack.pop();
            }
            array[top]=null;
            top = top-1;
            currentSize-=1;
        }


    }

    public int top() {
        if(top!=-1)
        return array[top];
        else
        return -1;
    
    }

    public int getMin() {

        if(tempStack.isEmpty())
        return -1;
        else
        return tempStack.peek();

    }

    public int getCurrentSize()
    {
      return currentSize;
    }
}
