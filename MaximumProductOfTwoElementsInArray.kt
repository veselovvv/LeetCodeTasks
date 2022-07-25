// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

class Solution {
    fun maxProduct(nums: IntArray): Int {
        var firstMax = 0
        var firstMaxIndex = 0
        var secondMax = 0
        
        nums.forEachIndexed { index, element ->
            if (element > firstMax) {
                firstMax = element
                firstMaxIndex = index
            }
        }
        
        nums.forEachIndexed { index, element ->
            if (element > secondMax && index != firstMaxIndex) secondMax = element
        }
     
        return (firstMax - 1) * (secondMax - 1)
    }
}
