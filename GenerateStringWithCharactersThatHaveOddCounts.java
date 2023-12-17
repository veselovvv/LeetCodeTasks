// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/description/

// Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.
// The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  

class Solution {
    public String generateTheString(int n) {
        String result = "";

        if (n == 1) result += "a";
        else if ((n-1) % 2 == 0) {
            result += "ab";

            for (int i = 1; i <= n-2; i++)
                result += "c";
        } else {
            result += "a";

            for (int i = 1; i <= n-1; i++)
                result += "c";
        } 

        return result;
    }
}
