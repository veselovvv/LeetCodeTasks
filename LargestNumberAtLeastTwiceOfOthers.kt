// https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
// You are given an integer array nums where the largest integer is unique.
// Determine whether the largest element in the array is at least twice as much as every other number in the array. 
// If it is, return the index of the largest element, or return -1 otherwise.

class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var result = 0
        var max = nums[0]

        nums.forEachIndexed { index, num ->
            if (num > max) {
                max = num
                result = index
            }
        }

        nums.forEachIndexed { index, num ->
            if (index != result && max < num * 2) return -1
        }

        return result
    }
}
