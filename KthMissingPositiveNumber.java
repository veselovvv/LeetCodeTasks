// https://leetcode.com/problems/kth-missing-positive-number/
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array.

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int count = 0;
        
        while (count != k) {
            if (!contains(arr, num)) count++;
            num++;
        }
        
        return num - 1;
    }

    public boolean contains(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == num) return true;

        return false;
    }
}
