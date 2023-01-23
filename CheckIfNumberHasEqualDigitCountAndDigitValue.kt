// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/

// You are given a 0-indexed string num of length n consisting of digits.
// Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

class Solution {
    fun digitCount(num: String): Boolean {
        var result = true

        num.forEachIndexed { index, char ->
            if (num.count { Character.getNumericValue(it) == index } != Character.getNumericValue(char)) result = false
        }

        return result
    }
}
