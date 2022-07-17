// https://leetcode.com/problems/running-sum-of-1d-array/
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val resultArray = IntArray(nums.size)
        var sum = 0
        
        nums.forEachIndexed { index, num ->
            sum += nums[index]
            resultArray[index] = sum
        }
        
        return resultArray
    }
}
