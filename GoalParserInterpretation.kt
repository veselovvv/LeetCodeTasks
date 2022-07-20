// https://leetcode.com/problems/goal-parser-interpretation/
// You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
// The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then 
// concatenated in the original order. Given the string command, return the Goal Parser's interpretation of command.

class Solution {
    fun interpret(command: String): String {
        var result = ""
        var ignoreChar = false
        
        command.forEach {
            if (!ignoreChar)
                when (it) {
                    ')' -> result += 'o'
                    'a' -> {
                        result += "al"
                        ignoreChar = true
                    }
                    '(' -> {}
                    else -> result += it
                }
            else if (it == ')') ignoreChar = false
        }
        
        return result
    }
}
