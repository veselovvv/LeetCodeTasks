// https://leetcode.com/problems/valid-palindrome/description/
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

class Solution {
    fun isPalindrome(s: String): Boolean {
        var string = ""

        s.toLowerCase().forEach { char ->
            if (char in 'a'..'z' || char in '0'..'9') string += char
        }

        return string == string.reversed()
    }
}
