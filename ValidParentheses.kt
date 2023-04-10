// https://leetcode.com/problems/valid-parentheses/description/
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

class Solution {
    fun isValid(s: String): Boolean {
        var openedCurlyBraces = 0
        var openedSquareBraces = 0
        var openedFigureBraces = 0
        val expectedClosedBraces = mutableListOf<Char>()
        
        s.forEach {
            when (it) {
                '(' -> {
                    openedCurlyBraces++
                    expectedClosedBraces.add(')')
                }
                '[' -> {
                    openedSquareBraces++
                    expectedClosedBraces.add(']')
                }
                '{' -> {
                    openedFigureBraces++
                    expectedClosedBraces.add('}')
                }
                ')' -> {
                    if (expectedClosedBraces.isEmpty() || expectedClosedBraces.last() != ')') return false
                    else expectedClosedBraces.removeAt(expectedClosedBraces.size - 1)
                    openedCurlyBraces--
                }
                ']' -> {
                    if (expectedClosedBraces.isEmpty() || expectedClosedBraces.last() != ']') return false
                    else expectedClosedBraces.removeAt(expectedClosedBraces.size - 1)
                    openedSquareBraces--
                }
                '}' -> {
                    if (expectedClosedBraces.isEmpty() || expectedClosedBraces.last() != '}') return false
                    else expectedClosedBraces.removeAt(expectedClosedBraces.size - 1)
                    openedFigureBraces--
                }
            }
        }
        
        return openedCurlyBraces == 0 && openedSquareBraces == 0 && openedFigureBraces == 0
    }
}
