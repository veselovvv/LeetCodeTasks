// https://leetcode.com/problems/second-largest-digit-in-a-string/description/
// Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
// An alphanumeric string is a string consisting of lowercase English letters and digits.

class Solution {
    fun secondHighest(s: String): Int {
        var max = -1
        var secondMax = -1

        s.forEach { char ->
            if (char in '0'..'9') {
                val num = Character.getNumericValue(char)

                if (num > max) max = num
            }
        }

        s.forEach { char ->
            if (char in '0'..'9') {
                val num = Character.getNumericValue(char)

                if (num > secondMax && num < max) secondMax = num
            }
        }

        return secondMax
    }
}
