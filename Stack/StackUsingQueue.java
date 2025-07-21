import java.util.*;

class StackQ{
   Queue<Integer> q = new LinkedList<>();

    public void push(Integer element)
    {
        q.add(element);
        
        int currentSize = q.size();

        for(int i=1;i<currentSize;i++)
        {
            q.add(q.poll());
            
        }
    }

    public Integer pop()
    {
        return q.poll();
    }
    public Integer getSize()
    {
        return q.size();
    }
    public boolean isEmpty()
    {
  
        return q.size()==0;
    }
}