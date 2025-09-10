// Given two numbers N and M, find the Nth root of M.
// The Nth root of a number M is defined as a number X such that
// when X is raised to the power of N, it equals M. If the Nth root 
// is not an integer, return -1.

// Input: N = 3, M = 27

// Output: 3

// Explanation: The cube root of 27 is equal to 3.


class Solution {
    public int NthRoot(int N, int M) {

        int low = 1;
        int high = M;

        while(low<=high)
        {
            int mid = (low+high)/2;
            int power = (int)Math.pow(mid,N);

            if(power==M)
            {
                return mid;
            }
            else if(power>M)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
        
    }
}
