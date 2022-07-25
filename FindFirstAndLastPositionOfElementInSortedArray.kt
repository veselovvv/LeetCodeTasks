// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1]. You must write an algorithm with O(log n) runtime complexity.

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        var start = true
        var first = -1
        var last = -1
        
        nums.forEachIndexed { index, element ->
            if (element == target && start) {
                first = index
                last = index
                start = false
            } else if (element == target) last = index
        }
        
        result[0] = first
        result[1] = last
        
        return result
    }
}
