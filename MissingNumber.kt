// https://leetcode.com/problems/missing-number/
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution {
    fun missingNumber(nums: IntArray): Int {
        var num = 0
        
        while (num != nums.size) {
            if (!nums.contains(num)) return num
            num++
        }
        
        return num
    }
}
