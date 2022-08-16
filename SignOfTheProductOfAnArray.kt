// https://leetcode.com/problems/sign-of-the-product-of-an-array/
// There is a function signFunc(x) that returns:
// 1 if x is positive.
// -1 if x is negative.
// 0 if x is equal to 0.
// You are given an integer array nums. Let product be the product of all values in the array nums. Return signFunc(product).

class Solution {
    fun arraySign(nums: IntArray): Int {
        var product = 1.0
        
        nums.forEach {
            product *= it
        }
        
        return when {
            product > 0 -> 1
            product < 0 -> -1
            else -> 0
        }
    }
}
