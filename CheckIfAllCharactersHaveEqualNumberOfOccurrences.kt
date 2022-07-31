// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences
// Given a string s, return true if s is a good string, or false otherwise.
// A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        val letters = mutableMapOf<Char, Int>()
        
        s.forEach {
            letters.put(it, letters.get(it)?.plus(1) ?: 1)
        }
        
        var times = 0
        
        letters.forEach {
            if (times == 0) times = it.value else if (times != it.value) return false
        }
        
        return true
    }
}
