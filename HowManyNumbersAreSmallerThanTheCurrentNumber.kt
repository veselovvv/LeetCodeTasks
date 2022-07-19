// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of 
// valid j's such that j != i and nums[j] < nums[i]. Return the answer in an array.

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        var resultArray = IntArray(0)
        
        nums.forEach { firstNum ->
            var smallerNums = 0
            
            nums.forEach { secondNum ->
                if (firstNum > secondNum) smallerNums++
            }
            
            resultArray += smallerNums
        }
        
        return resultArray
    }
}
