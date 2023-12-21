// https://leetcode.com/problems/monotonic-array/
// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

class Solution {
    public boolean isMonotonic(int[] nums) {
        int previousNum = nums[0];
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                if (nums[i] > previousNum) isDecreasing = false;
                else if (nums[i] < previousNum) isIncreasing = false;
            }
            
            previousNum = nums[i];
        }
        
        return isIncreasing || isDecreasing;
    }
}
