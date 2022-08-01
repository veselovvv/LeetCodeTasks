// https://leetcode.com/problems/sort-array-by-parity
// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var evenNums = IntArray(0)
        var oddNums = IntArray(0)
        
        nums.forEach {
            if (it % 2 == 0) evenNums += it else oddNums += it
        }
        
        return evenNums + oddNums
    }
}
