// https://leetcode.com/problems/three-consecutive-odds/
// Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odds = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) odds++; else odds = 0;
            if (odds == 3) return true;
        }
        
        return false;
    }
}
