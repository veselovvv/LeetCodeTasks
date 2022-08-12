// https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/
// Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. 
// The returned letter should be in uppercase. If no such letter exists, return an empty string.
// An English letter b is greater than another letter a if b appears after a in the English alphabet.

class Solution {
    fun greatestLetter(s: String): String {
        var letter = '0'
        
        s.forEach {
            if (it > letter && it.toUpperCase() == it && s.contains(it.toLowerCase())) letter = it
        }
        
        return if (letter == '0') "" else letter.toString()
    }
}
