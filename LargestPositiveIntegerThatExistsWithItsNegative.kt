// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/
// Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
// Return the positive integer k. If there is no such integer, return -1.

class Solution {
    fun findMaxK(nums: IntArray): Int {
        val sortedReversedNums = nums.copyOf()
        sortedReversedNums.sort()
        sortedReversedNums.reverse()

        var result = -1

        sortedReversedNums.forEach { num ->
            if (num > 0 && nums.contains(("-" + num.toString()).toInt())) return num
        }

        return result
    }
}
