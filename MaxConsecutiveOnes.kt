// https://leetcode.com/problems/max-consecutive-ones/
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var result = 0
        var currentOnesCount = 0
        
        nums.forEach {
            if (it == 1) currentOnesCount++ else currentOnesCount = 0
            if (currentOnesCount > result) result = currentOnesCount
        }
        
        return result
    }
}
