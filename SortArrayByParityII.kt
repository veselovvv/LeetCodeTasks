// https://leetcode.com/problems/sort-array-by-parity-ii/
// Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
// Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
// Return any answer array that satisfies this condition.

class Solution {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        var even = intArrayOf()
        var odd = intArrayOf()
        var result = intArrayOf()
        var evenIndex = 0
        var oddIndex = 0
        
        nums.forEach {
            if (it % 2 == 0) even += it else odd += it
        }
        
        nums.forEachIndexed { index, element ->
            if (index % 2 == 0) {
                result += even[evenIndex]
                evenIndex++
            } else {
                result += odd[oddIndex]
                oddIndex++
            }
        }
        
        return result
    }
}
