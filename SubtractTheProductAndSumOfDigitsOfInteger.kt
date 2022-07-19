// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var product = 1
        var sum = 0
        
        n.toString().forEach {
            val num = it.toString().toInt()
            product *= num
            sum += num
        }
        
        return product - sum
    }
}
