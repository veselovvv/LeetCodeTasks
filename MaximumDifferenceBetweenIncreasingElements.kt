// https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
// Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
// Return the maximum difference. If no such i and j exists, return -1.

class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var result = -1

        nums.forEachIndexed { index, num ->
            if (index > 0) {
                val difference = nums[index] - nums[index - 1]

                for (i in 0..index - 1) {
                    if (nums[index] != nums[i]) {
                        val difference = nums[index] - nums[i]

                        if (difference > result) result = difference
                    }
                }
            }
        }

        return result
    }
}
