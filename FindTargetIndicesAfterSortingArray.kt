// https://leetcode.com/problems/find-target-indices-after-sorting-array
// You are given a 0-indexed integer array nums and a target element target. A target index is an index i such that nums[i] == target.
// Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. 
// The returned list must be sorted in increasing order.

class Solution {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        var result = listOf<Int>()
        val array = nums
        array.sort()
        
        array.forEachIndexed { index, element ->
            if (element == target) result += index
        }
        
        return result
    }
}
