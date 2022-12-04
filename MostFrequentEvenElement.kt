// https://leetcode.com/problems/most-frequent-even-element/
// Given an integer array nums, return the most frequent even element.
// If there is a tie, return the smallest one. If there is no such element, return -1.

class Solution {
    fun mostFrequentEven(nums: IntArray): Int {
        var result = -1
        var smallestFrequency = -1
        
        nums.forEach { num ->
            if (num % 2 == 0) {
                val frequency = nums.count { 
                    it == num
                }
                
                if (smallestFrequency == -1 || frequency > smallestFrequency) {
                    smallestFrequency = frequency
                    result = num
                } else if (frequency == smallestFrequency && num < result) {
                    result = num
                }
            }
        }
        
        return result
    }
}
