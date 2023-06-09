// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. 
// There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target. 
// If such a character does not exist, return the first character in letters.

class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var min = '0' 

        letters.forEach { letter ->
            if (letter > target)
                if (min == '0') min = letter else if (letter < min) min = letter
        }

        return if (min == '0') letters.get(0) else min
    }
}
