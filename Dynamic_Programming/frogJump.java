//Time-->O(n) and Space O(1) optimized

public int frogJump(int[] heights) {

    int prev = 0;
    int prev2 = 0;

    for (int i = 1; i < heights.length; i++) {
        int first = prev + Math.abs(heights[i] - heights[i-1]);

        int second = Integer.MAX_VALUE;
        if (i > 1)
            second = prev2 + Math.abs(heights[i] - heights[i-2]);

        int curr = Math.min(first, second);
        prev2 = prev;
        prev = curr;
    }

    return prev;
}

//Time-->O(n) and Space O(n)

class Solution {
    public int frogJump(int[] heights) {

        int n = heights.length;
        int dp[] = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int firstStep = dp[i-1] + Math.abs(heights[i] - heights[i-1]);

            int secondStep = Integer.MAX_VALUE;
            if (i > 1) {
                secondStep = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }

            dp[i] = Math.min(firstStep, secondStep);
        }

        return dp[n-1];
    }
}




/*

A frog wants to climb a staircase with n steps. Given an integer array heights, where heights[i] contains the height of the ith step.



To jump from the ith step to the jth step, the frog requires abs(heights[i] - heights[j]) energy, where abs() denotes the absolute difference. The frog can jump from any step either one or two steps, provided it exists.



Return the minimum amount of energy required by the frog to go from the 0th step to the (n-1)th step.


Example 1

Input: heights = [2, 1, 3, 5, 4]

Output: 2

Explanation:

One possible route can be,

0th step -> 2nd Step = abs(2 - 3) = 1

2nd step -> 4th step = abs(3 - 4) = 1

Total = 1 + 1 = 2.

Example 2

Input: heights = [7, 5, 1, 2, 6]

Output: 9

Explanation:

One possible route can be,

0th step -> 1st Step = abs(7 - 5) = 2

1st step -> 3rd step = abs(5 - 2) = 3

3rd step -> 4th step = abs(2 - 6) = 4

Total = 2 + 3 + 4 = 9.

*/