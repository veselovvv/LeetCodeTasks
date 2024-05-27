// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/?envType=daily-question&envId=2024-05-27
// You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
// Notice that x does not have to be an element in nums.
// Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.

class Solution {
    fun specialArray(nums: IntArray): Int {
        for (i in 0..nums.size) {
            var numbers = 0

            nums.forEach { num ->
                if (num >= i) numbers++
            }

            if (numbers == i) return i
        }

        return -1
    }
}
