// https://leetcode.com/problems/monotonic-array/
// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var previousNum = nums[0]
        var isIncreasing = true
        var isDecreasing = true
        
        nums.forEachIndexed { index, num ->
            if (index != 0) {
                if (num > previousNum) isDecreasing = false
                else if (num < previousNum) isIncreasing = false
            }
            
            previousNum = nums[index]
        }
        
        return isIncreasing || isDecreasing
    }
}
