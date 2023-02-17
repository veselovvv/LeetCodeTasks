// https://leetcode.com/problems/reverse-vowels-of-a-string/description/
// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

class Solution {
    fun reverseVowels(s: String): String {
        val array = CharArray(s.length)
        var indices = arrayOf<Int>()
        var vowels = ""

        s.forEachIndexed { index, char ->
            if ("AaEeIiOoUu".contains(char)) {
                vowels += char
                indices += index
            } else
                array.set(index, char)
        }

        vowels.reversed().forEachIndexed { index, char ->
            array.set(indices[index], char)
        }

        var result = ""

        array.forEach { char ->
            result += char
        }

        return result
    }
}
