
class QueueS{

    java.util.ArrayList<Integer> al  = new java.util.ArrayList<>();
    Stack s = new Stack();

    public void push(Integer element)
    {
       int size1 = s.sizeOfStack();

        for(int i=0;i<size1;i++)
        {
            al.add(s.pop());
        }

        s.push(element);

        int listSize = al.size();

        for(int i=0;i<listSize;i++)
        {
            s.push(al.removeLast());
        }
    }

    public Integer pop()
    {
        return s.pop();
    }
}