class Solution {
    public int[] mergeSort(int[] nums) {

        divide(nums,0,nums.length-1);
        return nums;
    }

    public void divide(int[] nums,int low,int high)
    {

            if (low >= high) return;

            int mid = (low+high)/2;

            divide(nums,low,mid);
            divide(nums,mid+1,high);

            merge(nums,low,mid,high);

    }

    public void merge(int[] nums, int low ,int mid , int high)
    {
        java.util.ArrayList<Integer> temp = new java.util.ArrayList<>();


        int left = low,right = mid+1;

        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                temp.add(nums[left]);
                left++;
            }
            else
            {
                    temp.add(nums[right]);
                    right++;
            }
        }
        while(left<=mid)
        {
            temp.add(nums[left]);
                left++;
        }
        while(right<=high)
        {
            temp.add(nums[right]);
                    right++;
        }
        for(int i = low;i<=high;i++)
        {
            nums[i] = temp.get(i-low);
        }

    }
}