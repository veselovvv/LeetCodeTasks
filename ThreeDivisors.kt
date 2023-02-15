// https://leetcode.com/problems/three-divisors/description/
// Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
// An integer m is a divisor of n if there exists an integer k such that n = k * m.

class Solution {
    fun isThree(n: Int): Boolean {
        var count = 0

        for (num in 1..n) {
            if (n % num == 0) count++
        }

        return count == 3
    }
}
