//Given an array nums of size n and an integer k,
//  find the length of the longest sub-array that sums to k.
//  If no such sub-array exists, return 0.

class Solution {

    //O(n*n)
    public int longestSubarray(int[] nums, int k) {
        
        int sum=0;
        int start = 0;
        int len = 0;

        for(int i=0;i<nums.length;i++)
        {
          sum=0;
          start = i;
            for(int j=i;j<nums.length;j++)
            {
                    sum+=nums[j];
                        if(sum==k)
                        {
                            if(len<(j-start+1))
                            len = j-start+1;
                        }
            }
        }
       return len;
    }
}