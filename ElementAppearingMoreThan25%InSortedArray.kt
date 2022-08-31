// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
// Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

class Solution {
    fun findSpecialInteger(arr: IntArray): Int {
        var count = 0
        var index = 0
        
        while (true) {
            var element = arr[index]
            
            arr.forEach {
                if (it == element) count++
            }
            
            if (count > arr.size / 4) return element
            
            count = 0
            index++
        }
        
        return 0
    }
}
