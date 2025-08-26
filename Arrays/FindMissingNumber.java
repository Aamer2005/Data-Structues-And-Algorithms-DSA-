class Solution {
    public int missingNumber(int[] nums) {

        java.util.Arrays.sort(nums);

        int i =0;
        for( ; i<=nums.length ; i++)
        {
           int index = java.util.Arrays.binarySearch(nums,i);
           if(index < 0 )
           {
            break;
           }
        }  

        return i;      
    }
}