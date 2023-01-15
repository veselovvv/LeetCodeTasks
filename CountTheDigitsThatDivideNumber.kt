// https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/

// Given an integer num, return the number of digits in num that divide num.
// An integer val divides nums if nums % val == 0.

class Solution {
    fun countDigits(num: Int): Int {
        var result = 0

        num.toString().forEach { digit ->
            if (num % Character.getNumericValue(digit) == 0) result++
        }

        return result
    }
}
