// https://leetcode.com/problems/two-sum/description/
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index1, num1 ->
            nums.forEachIndexed { index2, num2 ->
                if (index1 != index2 && num1 + num2 == target)
                    return intArrayOf(index1, index2)
            }
        }

        return intArrayOf(-1, -1)
    }
}
