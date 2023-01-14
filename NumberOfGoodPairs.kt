// https://leetcode.com/problems/number-of-good-pairs/description/

// Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0

        nums.forEachIndexed { index, num ->
            nums.forEachIndexed { index1, num1 ->
                if (num == num1 && index < index1) result++
            }
        }

        return result
    }
}
