// https://leetcode.com/problems/contains-duplicate/
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.forEachIndexed { index1, num1 ->
            nums.forEachIndexed { index2, num2 ->
                if (num1 == num2 && index1 != index2) return true
            }
        }
        
        return false
    }
}
