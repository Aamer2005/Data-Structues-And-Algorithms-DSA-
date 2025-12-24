import java.util.Arrays;
class Solution{

public static void selectionSort(int[] array)
{
    int minIndex,temp ;

    for(int i=0;i<array.length-1;i++)
    {
        minIndex = i;
        for(int j=i;j<array.length-1;j++)
        {
            if(array[j]<array[minIndex])
            {
                minIndex = j;
            }
        }
        
        temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }
}

public static void main(String[] args)
{
    int[] array = {5,1,-3,2,0,10};
    selectionSort(array);
    System.out.println(Arrays.toString(array));
}

}