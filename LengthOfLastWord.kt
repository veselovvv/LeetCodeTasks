// https://leetcode.com/problems/length-of-last-word/description/
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var lastWord = ""
        var lastWordAlreadyHasALetter = false

        s.reversed().forEach { char ->
            if (lastWordAlreadyHasALetter)
                if (char != ' ') lastWord += char
                else return lastWord.length
            else if (char != ' ') {
                lastWord += char
                lastWordAlreadyHasALetter = true
            }
        }

        return s.filter { it != ' ' }.length
    }
}
