class Solution {
    public int[] quickSort(int[] nums) {

       qs(nums,0,nums.length-1);

        return nums;
    }

    public void qs(int[] nums, int low , int high)
    {
        if(low<high)
        {
            int pivotIndex = partition(nums,low,high);
            qs(nums,low , pivotIndex-1);
            qs(nums,pivotIndex+1,high);
        }
    }

    public int partition(int[] nums,int low , int high)
    {
        int pivot = nums[low];

        int i=low,j=high;

        while(i<j)
        {
            while(nums[i]<=pivot && i<=high-1)
            {
                i++;
            }
            while(nums[j]>pivot && j>=low-1)
            {
                j--;
            }

            if(i<j)
            swap(nums,i,j);
        }

        swap(nums,low,j);
        return j;
    }

    public void swap(int[] nums,int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}