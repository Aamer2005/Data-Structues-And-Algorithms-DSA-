//Given an integer array nums, return a list of all the leaders in the array.

//A leader in an array is an element whose value is strictly greater than all elements
//  to its right in the given array. 
// The rightmost element is always a leader. The elements in the leader
//  array must appear in the order they appear in the nums array.

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        
        java.util.ArrayList<Integer> mylist = new java.util.ArrayList<>();

        int max = nums[nums.length-1];
        mylist.add(max);

        for(int i=nums.length-2; i>=0 ; i--)
        {
            if(nums[i] > max)
            {
                max = nums[i];

                mylist.add(max);
            }
        }

        return mylist;
        
    }
}