// https://leetcode.com/problems/binary-search/
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
// If target exists, then return its index. Otherwise, return -1.

class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
    
        return -1;
    }
}
