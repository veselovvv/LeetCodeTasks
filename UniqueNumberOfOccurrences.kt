// https://leetcode.com/problems/unique-number-of-occurrences/
// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        var numsWithOccurrences = LinkedHashMap<Int, Int>()
        
        arr.forEach {
            numsWithOccurrences.put(it, numsWithOccurrences.get(it)?.plus(1) ?: 1)
        }
        
        val uniqueOccurrences = numsWithOccurrences.values.distinct()
        
        if (uniqueOccurrences.size != numsWithOccurrences.values.size) return false
        
        uniqueOccurrences.forEachIndexed { index, element ->
            if (numsWithOccurrences.values.toIntArray()[index] != element) return false
        }
        
        return true
    }
}
