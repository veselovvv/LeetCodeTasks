// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

class Solution {
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
        var result = mutableListOf<Int>()

        matrix.forEach { row ->
            var minIndex = 0
            var min = row.get(minIndex)

            row.forEachIndexed { index, element ->
                if (element < min) {
                    min = element
                    minIndex = index
                }
            }

            var max = min

            matrix.forEach { row ->
                val elementInTheColumn = row.get(minIndex)

                if (elementInTheColumn > max) 
                    max = elementInTheColumn
            }
            
            if (max == min) result.add(min)
        }

        return result
    }
}
