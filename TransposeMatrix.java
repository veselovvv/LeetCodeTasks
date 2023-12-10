// https://leetcode.com/problems/transpose-matrix/description/?envType=daily-question&envId=2023-12-10
// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

class Solution {
    public int[][] transpose(int[][] matrix) {
        int groups = matrix[0].length;
        int elementsInGroup = matrix.length;
        int[][] resultMatrix = new int[groups][elementsInGroup];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resultMatrix[j][i] = matrix[i][j];
            }
        }

        return resultMatrix;
    }
}
