// https://leetcode.com/problems/find-closest-number-to-zero/description/
// Given an integer array nums of size n, return the number with the value closest to 0 in nums. 
// If there are multiple answers, return the number with the largest value.

import kotlin.math.*

class Solution {
    fun findClosestNumber(nums: IntArray): Int {
        var result = nums[0]
        var closestDistance = abs(nums[0]) - 0

        nums.forEach { num ->
            val distance = abs(num) - 0

            if (distance < closestDistance) {
                closestDistance = distance
                result = num
            } else if (distance == closestDistance && num > result)
                result = num
        }

        return result
    }
}
