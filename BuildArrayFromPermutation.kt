// https://leetcode.com/problems/build-array-from-permutation/description/

// Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
// A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        var ans = intArrayOf()

        for (index in 0..nums.size-1) ans += nums[nums[index]]

        return ans
    }
}
