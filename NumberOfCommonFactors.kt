// https://leetcode.com/problems/number-of-common-factors/description/

// Given two positive integers a and b, return the number of common factors of a and b.
// An integer x is a common factor of a and b if x divides both a and b.

class Solution {
    fun commonFactors(a: Int, b: Int): Int {
        var result = 0

        if (a < b) {
            for (x in 1..a)
                if (a % x == 0 && b % x == 0) result++
        } else {
            for (x in 1..b)
                if (a % x == 0 && b % x == 0) result++
        }

        return result
    }
}
