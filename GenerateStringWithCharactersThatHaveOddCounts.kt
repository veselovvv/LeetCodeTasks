// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/description/

// Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.
// The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  

class Solution {
    fun generateTheString(n: Int): String {
        var result = ""

        if (n == 1) result += "a"
        else if ((n-1) % 2 == 0) {
            result += "ab"
            for (i in 1..n-2) result += "c"
        } else {
            result += "a"
            for (i in 1..n-1) result += "c"
        } 

        return result
    }
}
