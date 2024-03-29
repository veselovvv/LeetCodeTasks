// https://leetcode.com/problems/find-the-middle-index-in-array/description/
// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

class Solution {
    public int findMiddleIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < nums.length; j++) {
                if (j < i) leftSum += nums[j];
                else if (j > i) rightSum += nums[j];
            }

            if (leftSum == rightSum) return i;
        }

        return -1;
    }
}
