// https://leetcode.com/problems/smallest-index-with-equal-value/
// Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.
// x mod y denotes the remainder when x is divided by y.

class Solution {
    fun smallestEqual(nums: IntArray): Int {
        nums.forEachIndexed { index, element ->
            if (index % 10 == element) return index
        }
        
        return -1
    }
}
