// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/description/
// Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
// Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.

class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] % 3 == 0) {
                sum += nums[i];
                count++;
            }
        }

        if (count == 0) return 0; 
        else return sum / count;
    }
}
