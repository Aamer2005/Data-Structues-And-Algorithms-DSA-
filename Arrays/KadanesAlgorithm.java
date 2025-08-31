//Given an integer array nums, find the subarray with the largest
//  sum and return the sum of the elements present in that subarray.

// A subarray is a contiguous non-empty sequence of elements within an array.

//Addition : Also Find the index of max sum subarray 

class Solution {
      public int maxSubArray(int[] nums) {

        int sum=0;
        int max = Integer.MIN_VALUE;

        int startSubArrray=-1; //Addtion
        int endSubArray=-1;
        int start=0;

        for(int i=0;i<nums.length;i++)
        {
            if(sum==0) //Addtion
            start=i;

            sum+=nums[i];

            if(sum>max)
            {
                max = sum;

                startSubArrray = start;//Addtion
                endSubArray = i;
            }

            if(sum<0)
            {
                sum=0;
            }
        }

        System.out.println("SUBARRAY start : "+startSubArrray+"\nEND : "
        +endSubArray);//Addtion
        
        return max;
      }
}