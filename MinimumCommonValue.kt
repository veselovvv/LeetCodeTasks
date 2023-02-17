// https://leetcode.com/problems/minimum-common-value/description/
// Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. 
// If there is no common integer amongst nums1 and nums2, return -1.
// Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        nums1.forEach { num ->
            if (nums2.contains(num)) return num
        }

        return -1
    }
}
