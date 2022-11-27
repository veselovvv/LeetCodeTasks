// https://leetcode.com/problems/find-pivot-index/
// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
// Return the leftmost pivot index. If no such index exists, return -1.

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = 0
        
        nums.forEachIndexed { index1, num1 ->
            nums.forEachIndexed { index2, num2 ->
                if (index2 > index1) rightSum += num2
            }
            
            if (leftSum == rightSum) return index1
            else leftSum += num1
            
            rightSum = 0
        }
        
        return -1
    }
}
