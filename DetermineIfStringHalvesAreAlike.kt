// https://leetcode.com/problems/determine-if-string-halves-are-alike/
// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
// Notice that s contains uppercase and lowercase letters. Return true if a and b are alike. Otherwise, return false.

class Solution {
    fun halvesAreAlike(s: String): Boolean {
        var index = 0
        var vowelsInFirst = 0
        var vowelsInSecond = 0
        
        s.forEach {
            if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' 
                || it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U')
                if (index < s.length / 2) vowelsInFirst++ else vowelsInSecond++
            index++
        }
        
        return vowelsInFirst == vowelsInSecond
    }
}
