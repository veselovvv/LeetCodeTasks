// https://leetcode.com/problems/count-the-number-of-consistent-strings/description/

// You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in 
// the string allowed.
// Return the number of consistent strings in the array words.

class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var isWordValid = true
        var result = 0

        words.forEach { word ->
            word.forEach { char ->
                if (!allowed.contains(char)) isWordValid = false
            }

            if (isWordValid) result++ else isWordValid = true
        }

        return result
    }
}
