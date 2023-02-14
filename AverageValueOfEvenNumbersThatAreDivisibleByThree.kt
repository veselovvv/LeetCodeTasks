// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
// Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
// Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.

class Solution {
    fun averageValue(nums: IntArray): Int {
        var result = 0
        var count = 0

        nums.forEach { num ->
            if (num % 2 == 0 && num % 3 == 0) {
                result += num
                count++
            }
        }

        return if (count == 0) 0 else result / count
    }
}
