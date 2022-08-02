// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        
        grid.forEach { array ->
            array.forEach {
                if (it < 0) count++
            }
        }
        
        return count
    }
}
