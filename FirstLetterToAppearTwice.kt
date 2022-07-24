// https://leetcode.com/problems/first-letter-to-appear-twice/
// Given a string s consisting of lowercase English letters, return the first letter to appear twice.

class Solution {
    fun repeatedCharacter(s: String): Char {
        var saved = ""
        
        s.forEach {
            if (saved.contains(it)) return it else saved += it
        }
        
        return ' '
    }
}
