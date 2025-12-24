class Solution{
public static void mergeSort(int[] nums) {

        divide(nums,0,nums.length-1);
    }

public static void divide(int[] array,int low,int high)
{
    if(low>=high)return;

    int mid = (low+high)/2;
    
    divide(array,low,mid);
    divide(array,mid+1,high);

    merge(array,low,mid,high);
}

public static void merge(int[] array , int low,int mid , int high)
{
    int left = low;
    int right = mid+1;

    java.util.ArrayList<Integer> temp = new java.util.ArrayList<>();

    while(left<=mid && right<=high)
    {
        if(array[left]<=array[right])
        {
            temp.add(array[left]);
            left++;
        }
        else
        {
            temp.add(array[right]);
            right++;
        }
    }
    while(left<=mid)
    {
        temp.add(array[left]);
        left++;
    }
     while(right<=high)
    {
        temp.add(array[right]);
        right++;
    }
    for(int i = low;i<=high;i++)
        {
            array[i] = temp.get(i-low);
        }
}
public static void main(String[] args)
{
    int[] array = {4,3,-5,3,2};
    mergeSort(array);
    System.out.println(java.util.Arrays.toString(array));
}
}