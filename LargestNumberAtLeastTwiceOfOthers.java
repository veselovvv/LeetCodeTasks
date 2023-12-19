// https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
// You are given an integer array nums where the largest integer is unique.
// Determine whether the largest element in the array is at least twice as much as every other number in the array. 
// If it is, return the index of the largest element, or return -1 otherwise.

class Solution {
    public int dominantIndex(int[] nums) {
        int result = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                result = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != result && max < nums[i] * 2) return -1;
        }

        return result;
    }
}
