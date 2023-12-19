// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

// Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
// In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.

class Solution {
    public int maximumCount(int[] nums) {
        int positiveIntegersCount = 0;
        int negativeIntegersCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) positiveIntegersCount++;
            else if (nums[i] < 0) negativeIntegersCount++;
        }

        if (positiveIntegersCount > negativeIntegersCount) 
            return positiveIntegersCount;
        else 
            return negativeIntegersCount;
    }
}
