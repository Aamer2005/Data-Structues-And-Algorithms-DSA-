class Solution {
    int loop=0;
    int j=0;

    public int[] bubbleSort(int[] nums) {

            if(loop!=nums.length)
            {
                function2(nums,nums.length-1-loop);
                loop++;
                j=0;
                bubbleSort(nums);
            }

            return nums;
    }

    public void function2(int[] nums,int end)
    {
        int temp;

            if(j!=end)
            {
                if(nums[j]>nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                j++;
                function2(nums,end);
            }
    }   
}