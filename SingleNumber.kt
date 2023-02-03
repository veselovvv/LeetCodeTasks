// https://leetcode.com/problems/single-number/description/
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

class Solution {
    fun singleNumber(nums: IntArray): Int {
        nums.forEach { num ->
            if (nums.count { it == num } == 1) return num
        }

        return -1
    }
}
