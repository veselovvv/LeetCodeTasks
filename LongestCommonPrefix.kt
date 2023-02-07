// https://leetcode.com/problems/longest-common-prefix/description/
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var longestCommonPrefix = ""

        strs[0].forEach { char ->
            val newPrefix = longestCommonPrefix + char
            var everyStringStartsWithThePrefix = true

            strs.forEach { str ->
                if (!str.startsWith(newPrefix)) 
                    everyStringStartsWithThePrefix = false
            }


            if (everyStringStartsWithThePrefix) longestCommonPrefix += char
        }

        return longestCommonPrefix
    }
}
