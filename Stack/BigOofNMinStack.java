MinStack {

    private int top=-1;
    private int size=10;
    private Integer[] array=new Integer[size];
    private int currentSize=0;

    public MinStack() {
        
    }

    public void push(int val) {
        if(top==size-1)
        System.out.println("Stack OverFlow");
        else
        {
            top = top+1;
            array[top] = val;
            currentSize+=1;
        }
   
    }

    public void pop() {
        if(top==-1)
        System.out.println("Stack Underflow");
        else
        {
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

        Integer minElement = Integer.MAX_VALUE;

        for(int i=0;i<currentSize;i++)
        {
            
            if(array[i]<minElement && array[i]!=null)
            minElement = array[i];
        }
        
        return (int)minElement;
    }

    public int getCurrentSize()
    {
      return currentSize;
    }
}
