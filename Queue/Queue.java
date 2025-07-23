class Queue
 {
    int start=-1,end=-1;
    int size = 10;

    int currentSize=0;
    int array[] = new int[size];

    public boolean push(int element)
    {
        boolean result = false;
        if(start==-1 && end ==-1)
        {
        start=0;
        end=0;
        result = true;
        currentSize+=1;
        }
        else if(currentSize==size)
        {
            System.out.println("Queue OverFlow");
        }
        else
        {
            end=(end+1)%size;//for circular performation
            result = true;
            currentSize+=1;
        }
        array[end] = element;
        return result;
    }

    public int pop()
    {
        int element;
        if(currentSize==0)
        {
            System.out.println("Queue UnderFlow!!!");
            return -1;
        }

        element = array[start];
        if(currentSize==1)//restart the array because only element is their and it also popped
        {
            start=-1;
            end=-1;
            currentSize-=1; 
        }
        else
        {
            start=(start+1)%size;//for circular performation
            currentSize-=1;
        }

        return element;
    }

    public int getSize()
    {
        return currentSize;
    }

}