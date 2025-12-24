class BinarySearch{

public static Integer binarySearch(int[] arr,int element)
{
    int low = 0;
    int high = arr.length-1;
    int mid;

    while(low<=high)
    {
        mid = (low+high)/2;

        if(arr[mid]==element)
        return mid;

        if(element>arr[mid])
            low = mid+1;
        else if(element<arr[mid])
            high = mid-1;


    }

    return -1;
}

public static void main(String[] args)
{
    int[] arr = {1,2,3,4,5};

    System.out.println(binarySearch(arr,1));

    System.out.println(binarySearch(arr,2));

    System.out.println(binarySearch(arr,3));

    System.out.println(binarySearch(arr,4));

    System.out.println(binarySearch(arr,5));

    System.out.println(binarySearch(arr,-1));

}

}