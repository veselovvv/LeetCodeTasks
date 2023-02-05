// https://leetcode.com/problems/find-the-middle-index-in-array/description/
// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

class Solution {
    fun findMiddleIndex(nums: IntArray): Int {
        nums.forEachIndexed { index, num ->
            var leftSum = 0
            var rightSum = 0

            nums.forEachIndexed { index1, num1 ->
                if (index1 < index) leftSum += num1
                else if (index1 > index) rightSum += num1
            }

            if (leftSum == rightSum) return index
        }

        return -1
    }
}
