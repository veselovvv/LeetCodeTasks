// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
// You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty sub-array of arr and reverse it. 
// You are allowed to make any number of steps.
// Return true if you can make arr equal to target or false otherwise.

class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        var numsWithTheirQuantityMap = LinkedHashMap<Int, Int>()
        
        arr.forEach {
            numsWithTheirQuantityMap.put(it, numsWithTheirQuantityMap.get(it)?.plus(1) ?: 1)
        }
        
        target.forEach {
            if (numsWithTheirQuantityMap.keys.contains(it))
                if (numsWithTheirQuantityMap.get(it) != 1) 
                    numsWithTheirQuantityMap.put(it, numsWithTheirQuantityMap.get(it)?.minus(1) ?: 1)
                else numsWithTheirQuantityMap.remove(it)
            else return false
        }
        
        return true
    }
}
