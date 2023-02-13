// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/
// Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var count = 0

        for (num in low..high) {
            if (num % 2 == 1) count++
        }

        return count
    }
}
