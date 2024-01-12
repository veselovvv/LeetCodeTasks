// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
// Return true if a and b are alike. Otherwise, return false.

class Solution {
    fun halvesAreAlike(s: String): Boolean {
        var a = ""
        var b = ""

        s.forEachIndexed { index, char ->
            if (index < s.length / 2)
                a += char
            else b += char
        }

        val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        var aCount = 0
        var bCount = 0

        a.forEach { char ->
            if (vowels.contains(char)) aCount++
        }

        b.forEach { char ->
            if (vowels.contains(char)) bCount++
        }

        return aCount == bCount
    }
}
