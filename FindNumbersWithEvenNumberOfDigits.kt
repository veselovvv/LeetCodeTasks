// https://leetcode.com/problems/find-numbers-with-even-number-of-digits
// Given an array nums of integers, return how many of them contain an even number of digits.

class Solution {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        
        nums.forEach {
            if (it.toString().length % 2 == 0) count++
        }
        
        return count
    }
}
