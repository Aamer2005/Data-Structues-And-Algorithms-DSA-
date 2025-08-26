// Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

class Solution {
     public int findMaxConsecutiveOnes(int[] nums) {
        
        String s = "";

        for(int i : nums)
        {
            s+=i;
        }
        String[] arr = s.split("0");
        
        int ones=0;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i].contains("1"))
                {
                    if(ones<arr[i].length())
                    {
                        ones = arr[i].length();
                    }
                }
        }

        return ones;
    }
}