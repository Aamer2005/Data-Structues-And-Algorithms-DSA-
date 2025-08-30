class Solution {
    public int findMin(int[] nums) {

        int target = Integer.MAX_VALUE;

        int low=0;
        int high = nums.length-1;

        while(low<high)
        {
            int mid = (low+high)/2;

            if(nums[mid] > nums[high])          // Minimum must be in right half
            {
                low = mid+1;
            }
            else
            {
                high = mid;  // Minimum is in left half (including mid)
            }
           
        }
        return nums[low];
    }
}