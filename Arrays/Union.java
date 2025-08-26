// Problem :
// Union of two sorted arrays

// Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays.
// The elements in the union must be in ascending order.
// The union of two arrays is an array where all values are distinct and are present in either
// the first array, the second array, or both.


// Examples:
// Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

// Output: [1, 2, 3, 4, 5, 7]

// Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2



class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length+nums2.length];
        int count=0;

        for(int i=0;i<nums1.length;i++)
        {
            if(java.util.Arrays.binarySearch(result, 0, count, nums1[i]) < 0)
            {
                result[count] = nums1[i];
                count++;
                java.util.Arrays.sort(result, 0, count); 
            }
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            if(java.util.Arrays.binarySearch(result, 0, count, nums2[i]) < 0)
            {
                result[count] = nums2[i];
                count++;
            }
            java.util.Arrays.sort(result,0,count);
        }

        int[] unionArray = java.util.Arrays.copyOfRange(result,0,count);
        
        return unionArray;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2,2, 3, 4,4, 5};
        int[] nums2 = {1,1, 2, 7};
        int[] result = sol.unionArray(nums1, nums2);
        System.out.println(java.util.Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 7]
    }
}