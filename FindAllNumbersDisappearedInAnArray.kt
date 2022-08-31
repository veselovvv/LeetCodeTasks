// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        
        for (num in 1..nums.size) {
            if (!nums.contains(num)) result.add(num)
        }
        
        return result
    }
}
