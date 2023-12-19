// https://leetcode.com/problems/max-consecutive-ones/
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int currentOnesCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) currentOnesCount++; 
            else currentOnesCount = 0;

            if (currentOnesCount > result) result = currentOnesCount;
        }

        return result;
    }
}
