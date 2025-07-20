class Element{

    static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void main(String[] args)
    {
       int[] array = {1,2,3,4,5,6,7};

        String result = java.util.Arrays.toString(array);
        System.out.println(result);

        
        
    }

    public static int findLargestElement(int[] array)
    {
            int max = 0;

            for(int i = 0 ; i<array.length;i++)
            {
                if(array[i]>max)
                max = array[i];
            }

            return max;
    }

    public static int findSmallestElement(int[] array)
    {
            int min = Integer.MAX_VALUE;

            for(int i = 0 ; i<array.length;i++)
            {
                if(array[i]<min)
                min = array[i];
            }

            return min;
    }

    public static int linearSearch(int[] array,int element)
    {
        int index =-1;
       
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

    public static int binarySearch(int[] array,int number)
    {
            int index = -1,
            low=0,
            high = array.length-1,
            mid=0;

            while(true)
            {

                if(low!=high)
                {
                    mid = low+high/2;

                    if(array[mid]==number)
                    {
                        index=mid;
                        break;
                    }
                    else if(array[mid]>number)
                    {
                        high=mid;
                    }
                    else if(array[mid]<number)
                    {
                        low=mid;
                    }
                }
                else
                {
                    index=-1;
                    break;
                }
            }

            return index;
    }

    public static int[] reverseArray(int[] org_array)
    {
        int temp;

        int[] array = java.util.Arrays.copyOf(org_array,org_array.length);

        for(int i=0,j=array.length-1;i<array.length/2;i++,j--)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }

    public static void swapMinMaxElement(int[] array)
    {
        int largest = findLargestElement(array);
        int smallest = findSmallestElement(array);

        int index1 = linearSearch(array , largest);
        int index2 = linearSearch(array,smallest);

        array[index1] = smallest;
        array[index2] = largest;
    }

    public static int[] bubbleSort(int[] array)
    {
        int temp;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-1;j++)
            {
                if(array[j]>array[j+1])
                {
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                }
            }
        }

        return array;
    }

    public static int[] selectionSort(int[] array)
    {
        int minIndex,temp=0;
        int size = array.length;
        for(int i=0;i<array.length;i++)
        {
            minIndex = i;
            for(int j = i;j<=size-1;j++)
            {
                if(array[j]<array[minIndex])
                {
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i]=temp;
        }

        return array;
    } 
}