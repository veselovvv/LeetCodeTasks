// https://leetcode.com/problems/search-a-2d-matrix-ii/
// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
// - Integers in each row are sorted in ascending from left to right.
// - Integers in each column are sorted in ascending from top to bottom.

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        matrix.forEach { array ->
            array.forEach {
                if (it == target) return true
            }
        }
        
        return false
    }
}
