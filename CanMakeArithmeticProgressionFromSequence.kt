// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
// A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
// Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        var firstDifferences = intArrayOf()
        var secondDifferences = intArrayOf()
        val sorted = arr.sorted()
        var previousInt = sorted[0]
        
        sorted.forEachIndexed { index, element ->
            if (index != 0) {
                firstDifferences += element - previousInt
                previousInt = element
            }
        }
        
        val reversed = sorted.reversed()
        previousInt = reversed[0]
        
        reversed.forEachIndexed { index, element ->
            if (index != 0) {
                secondDifferences += element - previousInt
                previousInt = element
            }
        }
        
        firstDifferences.forEach { first ->
            secondDifferences.forEach { second ->
                if (Math.abs(first) != Math.abs(second)) return false
            }
        }
        
        return true
    }
}
