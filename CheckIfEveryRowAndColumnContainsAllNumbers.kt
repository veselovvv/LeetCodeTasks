// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/description/
// An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
// Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

class Solution {
    fun checkValid(matrix: Array<IntArray>): Boolean {
        if (matrix[0].distinct().sorted() != matrix[0].toList().sorted()) 
            return false

        val requiredValues = matrix[0]

        matrix.forEach { row ->
            if (row.distinct().sorted() != requiredValues.toList().sorted()) 
                return false
        }

        for (index in 1..matrix.size-1) {
            var column = intArrayOf()

            matrix.forEach { row ->
                column += row.get(index)
            }

            if (column.distinct().sorted() != requiredValues.toList().sorted()) 
                return false
        }

        return true
    }
}
