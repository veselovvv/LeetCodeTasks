// https://leetcode.com/problems/detect-capital/
// We define the usage of capitals in a word to be right when one of the following cases holds:
// - All letters in this word are capitals, like "USA".
// - All letters in this word are not capitals, like "leetcode".
// - Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

class Solution {
    fun detectCapitalUse(word: String) = when {
        word == word.toUpperCase() -> true
        word == word.toLowerCase() -> true
        word.isCapitalized() -> true
        else -> false
    }
    
    fun String.isCapitalized(): Boolean {
        forEachIndexed { index, char ->
            if (index == 0) {
                if (char.isLowerCase()) return false
            } else {
                if (char.isUpperCase()) return false
            }
        }
        
        return true
    }
}
