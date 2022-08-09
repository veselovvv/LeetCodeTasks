// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
// Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

class Solution {
    fun checkString(s: String): Boolean {
        var isB = false
        
        s.forEach {
            if (it == 'b') isB = true else if (isB) return false
        }
        
        return true
    }
}
