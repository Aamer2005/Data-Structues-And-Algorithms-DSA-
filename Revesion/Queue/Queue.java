class Queue{
int size = 3;
Integer[] arr = new Integer[size];

int start=-1,end=-1;

int currSize = 0;

public void add(Integer element)
{


    if(currSize==0)
    {
        start = 0;
        end = 0;
        currSize++;
    }
    else if(currSize==size)
    {
        System.out.println("Overflow");
    }
    else{
        end = (end+1)%size;
        currSize++;
    }

    arr[end] = element;

}

public Integer remove()
{
    Integer element;
    if(start==-1)
    return -1;

    if(start==end)
    {
        element = arr[start];
        start = -1;
        end = -1;
        currSize--;
    }
    else
    {
        element = arr[start];
        start = (start+1)%size;
        currSize--;
    }

    return element;
}

}

class Solution{
public static void main(String[] args)
{
    Queue q = new Queue();

    q.add(10);
    q.add(11);
    q.add(12);
    System.out.println(q.remove());
    q.add(13);
    System.out.println(q.remove());
    System.out.println(q.end);


}
}