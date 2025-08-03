// Print 1 to N using Recursion

// Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.

// You must not use any loops such as for, while, or do-while.
// The function should print each number on a separate line, in increasing order from 1 to n.

// Examples:
// Input: n = 5

// Output:

// 1  

// 2  

// 3  

// 4  

// 5

// Input: n = 1

// Output:

// 1

// Constraints:
// 1 <= n <= 100

/*********************OUTPUT *****************************/

class Solution {
    public static void printNumbers(int n) {
        // Your code goes here

        if(n>0)
        {
        if(n==1)
        System.out.println(1);
        else
        {
            printNumbers(n-1);
             System.out.println(n);
        }
        }
    }

    public static void main(String[] args)
    {
        printNumbers(10);
    }
}