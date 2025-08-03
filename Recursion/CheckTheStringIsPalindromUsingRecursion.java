// Given a string s, return true if the string is palindrome, otherwise false.

// A string is called palindrome if it reads the same forward and backward.

// Examples:
// Input : s = "hannah"

// Output : true

class Solution {   
    public static boolean palindromeCheck(String s) {
        //your code goes here

        if(s.length()==1 || s.length()==0)
        return true;

        else if(s.length()>1 && s.charAt(0)==s.charAt(s.length()-1))
        return palindromeCheck(s.substring(1,s.length()-1));
        
        else
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(palindromeCheck("Hello"));
        System.out.println(palindromeCheck("aabbaa"));
        System.out.println(palindromeCheck("12321"));
    }
}