// https://leetcode.com/problems/three-consecutive-odds/
// Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.

class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var odds = 0
        
        arr.forEach {
            if (it % 2 != 0) odds++ else odds = 0
            if (odds == 3) return true
        }
        
        return false
    }
}
