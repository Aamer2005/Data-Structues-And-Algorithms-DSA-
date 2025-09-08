// Find out how many times the array is rotated
// Given an integer array nums of size n, sorted in ascending order with distinct values.
// The array has been right rotated an unknown number of times, between 0 and n-1 (including). 
// Determine the number of rotations performed on the array.

// Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]

// Output: 4

class Solution {
    public int findKRotation(int[] nums) {

        int low = 0,high = nums.length-1,mid = 0;
        
        if(nums[low] <= nums[high]) return 0;

        while(low<high)
        {
            mid = (low+high) / 2;

            if(mid < nums.length-1 && nums[mid]>nums[mid+1]) return mid+1;

            if(mid>0 && nums[mid-1]>nums[mid]) return mid;

            if(nums[low] > nums[mid])
            {
                high = mid;
            }
            else if(nums[low]<nums[mid])
            {
                low = mid+1;
            }
        }

        return low;
    }
}