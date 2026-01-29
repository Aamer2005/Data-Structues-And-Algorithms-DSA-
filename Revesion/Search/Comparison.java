class Compare
{
    public static int linear(int[] arr, int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)return i;
        }

        return -1;
    }

    public static int binary(int[] arr, int element)
    {
        int low=0,high=arr.length-1;
        int mid = (low+high)/2;

        while(low<=high)
        {
            if(element==arr[mid])
            return mid;

            else if(element>arr[mid])
            low = mid+1;

            else if(element<arr[mid])
            high = mid-1;

            mid = (low+high)/2;
        }

        return -1;
    }

    public static void comparison(int[] arr ,int element)
    {
        int iteration = 1000;

        long ls = System.nanoTime();
        for(int i = 0;i<iteration;i++)
            linear(arr,element);
        long lf = System.nanoTime();

        long bs = System.nanoTime();
        for(int i=0;i<iteration;i++)
            binary(arr,element);
        long bf = System.nanoTime();

        System.out.println("Linear Search Time : "+(lf-ls)/iteration);
        System.out.println("Binary Search Time : "+(bf-bs)/iteration);

    }

    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = i+1;
        }

        System.out.println(linear(arr,8));
        System.out.println(binary(arr,8));
        comparison(arr,8);
    }
}