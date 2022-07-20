// https://leetcode.com/problems/decompress-run-length-encoded-list
// We are given a list nums of integers representing a list compressed with run-length encoding.
// Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  
// For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the 
// decompressed list. Return the decompressed list.

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var result = IntArray(0)
        var freq = 0
        var value = 0
        
        nums.forEachIndexed { index, element ->
            if (index % 2 == 0) freq = element 
            else {
                value = element
                while (freq != 0) {
                    result += value
                    freq--
                }
            }
        }
        
        return result
    }
}
