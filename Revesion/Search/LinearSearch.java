class Solution{
public static int linearSearch(int[] array,int element)
{
    int index = -1;

    for(int i=0;i<array.length;i++)
    {
        if(array[i]==element)
        {
            index = i;
            break;
        }
    }

    return index;
}

public static void main(String[] args)
{
    int[] array = {4,3,-5,3,2};
    System.out.println(linearSearch(array,2));
    System.out.println(java.util.Arrays.toString(array));
}

}