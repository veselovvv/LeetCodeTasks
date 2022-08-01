// https://leetcode.com/problems/n-repeated-element-in-size-2n-array
// You are given an integer array nums with the following properties:
// - nums.length == 2 * n.
// - nums contains n + 1 unique elements.
// - Exactly one element of nums is repeated n times.
// Return the element that is repeated n times.

class Solution {
    fun repeatedNTimes(nums: IntArray): Int {
        var index = 0
        var count = 0
        var result = 0
        
        while (count != nums.size / 2) {
            result = nums[index]
            
            nums.forEach {
                if (it == result) count++
            }
            
            index++
            if (count != nums.size / 2) count = 0
        }
        
        return result
    }
}
