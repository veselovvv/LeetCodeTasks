// https://leetcode.com/problems/keyboard-row/
// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard.
// In the American keyboard:
// - the first row consists of the characters "qwertyuiop",
// - the second row consists of the characters "asdfghjkl", and
// - the third row consists of the characters "zxcvbnm".

class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val firstRow = "qwertyuiop"
        val secondRow = "asdfghjkl"
        val thirdRow = "zxcvbnm"
        var usedRow = 0
        var isStringOk = true
        var result = arrayOf<String>()
        
        words.forEach { string ->
            string.forEachIndexed { index, char ->
                if (index == 0) {
                    if (firstRow.contains(char.toLowerCase())) usedRow = 1
                    else if (secondRow.contains(char.toLowerCase())) usedRow = 2
                    else if (thirdRow.contains(char.toLowerCase())) usedRow = 3
                } else {
                    when (usedRow) {
                        1 -> if (!firstRow.contains(char.toLowerCase())) isStringOk = false
                        2 -> if (!secondRow.contains(char.toLowerCase())) isStringOk = false
                        3 -> if (!thirdRow.contains(char.toLowerCase())) isStringOk = false
                    }
                }
            }
            if (isStringOk) result += string else isStringOk = true
        }
        
        return result
    }
}
