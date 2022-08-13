// https://leetcode.com/problems/relative-sort-array/
// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. 
// Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        var count = 0
        var arr1Elements = intArrayOf()
        var result = intArrayOf()
        
        arr2.forEach { item2 ->
            arr1.forEach { item1 ->
                if (item1 == item2) count++
            }
            
            while (count != 0) {
                result += item2
                count--
            }
        }
        
        arr1.forEach {
            if (!arr2.contains(it)) arr1Elements += it
        }
        
        result += arr1Elements.sorted()
        return result
    }
}
