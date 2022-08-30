// https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
// Given a binary string s, return true if the longest contiguous segment of 1's is strictly longer than the longest contiguous segment of 0's in s, 
// or return false otherwise.

class Solution {
    fun checkZeroOnes(s: String): Boolean {
        var theLongestSegmentOf1 = 0
        var theLongestSegmentOf0 = 0
        var currentSegmentOf1 = 0
        var currentSegmentOf0 = 0
        
        s.forEachIndexed { index, num ->
            if (num == '1') {
                currentSegmentOf1++
                if (currentSegmentOf0 > theLongestSegmentOf0) theLongestSegmentOf0 = currentSegmentOf0
                if (index == s.length - 1 && currentSegmentOf1 > theLongestSegmentOf1) 
                    theLongestSegmentOf1 = currentSegmentOf1
                currentSegmentOf0 = 0
            } else {
                currentSegmentOf0++
                if (currentSegmentOf1 > theLongestSegmentOf1) theLongestSegmentOf1 = currentSegmentOf1
                if (index == s.length - 1 && currentSegmentOf0 > theLongestSegmentOf0) 
                    theLongestSegmentOf0 = currentSegmentOf0
                currentSegmentOf1 = 0
            }
        }
        
        return theLongestSegmentOf1 > theLongestSegmentOf0
    }
}
