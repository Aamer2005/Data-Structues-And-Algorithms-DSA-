
import java.util.Arrays;

class Solution
{

public static void bubbleSort(int[] array)
{
    int temp;

    for(int i=0;i<array.length;i++)
    {
        for(int j=0;j<array.length-1;j++)
        {
            if(array[j]>array[j+1])
            {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
}

public static void main(String[] args)
{
    int[] array = {5,1,-3,2,0,10};
    bubbleSort(array);
    System.out.println(Arrays.toString(array));
}


}