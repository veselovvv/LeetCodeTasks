// https://leetcode.com/problems/transpose-matrix/description/?envType=daily-question&envId=2023-12-10
// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val groups = matrix[0].size
        val elementsInGroup = matrix.size
        val resultMatrix = Array(groups) { IntArray(elementsInGroup) }

        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                resultMatrix[j][i] = matrix[i][j]
            }
        }

        return resultMatrix
    }
}
