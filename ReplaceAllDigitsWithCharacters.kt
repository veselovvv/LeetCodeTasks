// https://leetcode.com/problems/replace-all-digits-with-characters
// You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.
// There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.
// For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).
// Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.

class Solution {
    fun replaceDigits(s: String): String {
        var char = '-'
        var result = ""
        
        s.forEach {
            if (it.isDigit())
                result += char + Character.getNumericValue(it)
            else {
                result += it
                char = it
            }
        }
        
        return result
    }
}
