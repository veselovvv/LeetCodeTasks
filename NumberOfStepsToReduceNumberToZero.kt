// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
// Given an integer num, return the number of steps to reduce it to zero. 
// In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

class Solution {
    fun numberOfSteps(num: Int): Int {
        var newNum = num
        var count = 0
        
        while (newNum != 0) {
            if (newNum % 2 == 0) newNum /= 2 else newNum--
            count++
        }
        return count
    }
}
