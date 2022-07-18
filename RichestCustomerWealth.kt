// https://leetcode.com/problems/richest-customer-wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i^th customer has in the j^th bank. 
// Return the wealth that the richest customer has. A customer's wealth is the amount of money they have in all their bank accounts. 
// The richest customer is the customer that has the maximum wealth.

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        val array = IntArray(accounts.size)
        
        accounts.forEachIndexed { index, element ->
            element.forEach {
                array[index] += it
            }
        }
        
        var max = 0
        
        array.forEach {
            if (it > max) max = it
        }
        
        return max
    }
}
