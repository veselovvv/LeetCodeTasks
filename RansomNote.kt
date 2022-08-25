// https://leetcode.com/problems/ransom-note/
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
// Each letter in magazine can only be used once in ransomNote.

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var lettersWithTheirQuantity = mutableMapOf<Char, Int>()
        
        magazine.forEach {
            lettersWithTheirQuantity.put(it, lettersWithTheirQuantity.get(it)?.plus(1) ?: 1)
        }
        
        ransomNote.forEach {
            if (lettersWithTheirQuantity.keys.contains(it) && lettersWithTheirQuantity.get(it) != 0)
                lettersWithTheirQuantity.put(it, lettersWithTheirQuantity.get(it)?.minus(1) ?: 0)
            else return false
        }
        
        return true
    }
}
