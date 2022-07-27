// https://leetcode.com/problems/reverse-prefix-of-word/
// Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
// If the character ch does not exist in word, do nothing. Return the resulting string.

class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        var result = ""
        var reverse = ""
        var isReverseDone = false
        
        word.forEach {
            if (!isReverseDone) {
                if (it == ch) {
                    reverse += it
                    result += reverse.reversed()
                    isReverseDone = true
                } else reverse += it
            } else result += it
        }
        
        return if (word.contains(ch)) result else word
    }
}
