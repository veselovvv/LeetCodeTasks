// https://leetcode.com/problems/find-the-difference-of-two-arrays/
// Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
// - answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
// - answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
// Note that the integers in the lists may be returned in any order.

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        var answer1 = listOf<Int>()
        var answer2 = listOf<Int>()
        
        nums1.forEach {
            if (!answer1.contains(it) && !nums2.contains(it)) answer1 += it
        }
        
        nums2.forEach {
            if (!answer2.contains(it) && !nums1.contains(it)) answer2 += it
        }
        
        return listOf(answer1, answer2)
    }
}
