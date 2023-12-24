// https://leetcode.com/problems/single-number/description/
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (count(nums, nums[i]) == 1) return nums[i];
        }

        return -1;
    }

    public int count(int[] nums, int num) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) count++;
        }

        return count;
    }
}
