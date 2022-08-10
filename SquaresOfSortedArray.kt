// https://leetcode.com/problems/squares-of-a-sorted-array/
// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var result = IntArray(0)
        
        nums.forEach {
            result += it * it
        }
        
        result.sort()
        return result
    }
}
