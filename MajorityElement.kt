// https://leetcode.com/problems/majority-element/
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var numWithItsCount = mutableMapOf<Int, Int>()
        var resultCount = 0
        var result = 0
        
        nums.forEach {
            numWithItsCount.put(it, numWithItsCount.get(it)?.plus(1) ?: 1)
        }
        
        numWithItsCount.forEach {
            if (it.value > resultCount) {
                resultCount = it.value
                result = it.key
            }
        }
        
        return result
    }
}
