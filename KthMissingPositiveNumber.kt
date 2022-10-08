// https://leetcode.com/problems/kth-missing-positive-number/
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array.

class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var num = 1
        var count = 0
        
        while (count != k) {
            if (!arr.contains(num)) count++
            num++
        }
        
        return num - 1
    }
}
