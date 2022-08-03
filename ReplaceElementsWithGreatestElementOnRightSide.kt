// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side
// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
// After doing so, return the array.

class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        var currentIndex = 0
        var result = IntArray(0)
        
        while (currentIndex < arr.size) {
            arr.forEachIndexed { index, element ->
                if (index > currentIndex)
                    if (element > max) max = element
            }

            result += max
            max = -1
            currentIndex++
        }
        
        return result
    }
}
