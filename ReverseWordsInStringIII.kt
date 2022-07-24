// https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

class Solution {
    fun reverseWords(s: String): String {
        var str = s + ' '
        var word = ""
        var words = arrayOf<String>()
        
        str.forEach {
            if (it != ' ') word += it 
            else {
                words += word.reversed()
                word = ""
            }
        }
        
        var result = ""
        
        words.forEach {
            result += it + " "
        }
        
        return result.dropLast(1)
    }
}
