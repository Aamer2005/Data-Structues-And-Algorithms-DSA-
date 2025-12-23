class Array{

//int[] arr = new int[size]
//int[] arr = {1,2,3,4}

private Integer[] array;

Array(Integer... elements)
{
    this.array = elements;
}

public void getArray()
{
    System.out.print("[");
    for(Integer i:array)
    {
        System.out.print(i+",");
    }
    System.out.println("]");
}

public Boolean insert(Integer element ,int index)
{
    if(index>=array.length)
    {
        return false;
    }

    array[index] = element;
    return true;
}

public int getSize()
{
    return array.length;
}

}


class Solution{

public static void main(String[] args)
{
    Array arr = new Array(1,2,3,4,5,6);

    arr.getArray();
    System.out.println(arr.getSize());

    arr.insert(10,2);
    arr.getArray();

}
}
