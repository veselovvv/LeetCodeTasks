// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = 0;
        int firstMaxIndex = 0;
        int secondMax = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                firstMax = nums[i];
                firstMaxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax && i != firstMaxIndex) secondMax = nums[i];
        }
        
        return (firstMax - 1) * (secondMax - 1);
    }
}
