// https://leetcode.com/problems/binary-search/
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
// If target exists, then return its index. Otherwise, return -1.

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        nums.forEachIndexed { index, element ->
            if (element == target) return index
        }
        
        return -1
    }
}
