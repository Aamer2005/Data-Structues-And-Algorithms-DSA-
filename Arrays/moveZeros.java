/**Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0] */


class Solution {
    java.util.ArrayList<Integer> al = new java.util.ArrayList<>();

    public void moveZeroes(int[] nums) {
        int zeroCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeroCount++;
            }
            else
            {
                al.add(nums[i]);
            }
        }

        for(int i=0 ; i < nums.length ; i++)
        {
            if(al.isEmpty()==false)
            nums[i] = al.removeFirst().intValue();
            else
            nums[i] = 0;
        }
        
    }

   
}