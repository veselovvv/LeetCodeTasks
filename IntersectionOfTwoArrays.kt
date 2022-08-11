// https://leetcode.com/problems/intersection-of-two-arrays/
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        var result = intArrayOf()
        
        nums1.forEach { 
            if (!result.contains(it) && nums2.contains(it)) result += it
        }
        
        return result
    }
}
