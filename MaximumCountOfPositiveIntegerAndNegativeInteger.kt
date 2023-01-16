// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

// Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
// In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.

class Solution {
    fun maximumCount(nums: IntArray): Int {
        var positiveIntegersCount = 0
        var negativeIntegersCount = 0

        nums.forEach { num ->
            if (num > 0) positiveIntegersCount++
            else if (num < 0) negativeIntegersCount++
        }

        if (positiveIntegersCount > negativeIntegersCount) return positiveIntegersCount
        else return negativeIntegersCount
    }
}
