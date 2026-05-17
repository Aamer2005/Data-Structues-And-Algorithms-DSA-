/** 
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
**/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0 , len = 0 , l  = 0  , r= 0;

        HashMap<Character , Integer> mp = new HashMap<>();
        while(r<s.length())
        {
            char c = s.charAt(r);
            if(mp.containsKey(c))
            {
                l = Math.max(l,mp.get(c)+1);
                mp.remove(c);
            }

            mp.put(c,r);

            len = r-l+1;
            max = Math.max(max,len);
            r+=1;
        }
        
        return max;
    }
}