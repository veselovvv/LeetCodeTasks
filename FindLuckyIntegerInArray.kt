// https://leetcode.com/problems/find-lucky-integer-in-an-array/
// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
// Return the largest lucky integer in the array. If there is no lucky integer return -1.

class Solution {
    fun findLucky(arr: IntArray): Int {
        var theLargestLuckyNum = -1
        
        arr.forEach { num1 ->
            var count = 0
            
            arr.forEach { num2 ->
                if (num2 == num1) count++
            }
            
            if (count == num1 && num1 > theLargestLuckyNum) theLargestLuckyNum = num1
        }
        
        return theLargestLuckyNum
    }
}
