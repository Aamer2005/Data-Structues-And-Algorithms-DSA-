// Sum of First N Numbers


// Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.


// Examples:
// Input : N = 4

// Output : 10

// Explanation : first four natural numbers are 1, 2, 3, 4.

// Sum is 1 + 2 + 3 + 4 => 10.

// Input : N = 2

// Output : 3

// Explanation : first two natural numbers are 1, 2.

// Sum is 1 + 2 => 3.
// Constraints:
// 1 <= N <= 103


class Solution {
    public static int NnumbersSum(int N) {
        //your code goes here

        if(N==1)
        return 1;
        else
        return NnumbersSum(N-1)+N;
    }

    public static void main(String[] args)
    {
        System.out.println(NnumbersSum(4));
    }
}