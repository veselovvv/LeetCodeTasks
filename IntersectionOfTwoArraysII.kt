// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays 
// and you may return the result in any order.

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        var result = intArrayOf()
        
        if (nums1.size < nums2.size) {
            val nums2ArrayList = nums2.toCollection(ArrayList())
            
            nums1.forEach {
                if (nums2ArrayList.contains(it)) {
                    result += it
                    nums2ArrayList.remove(it)
                }
            }
        } else {
            val nums1ArrayList = nums1.toCollection(ArrayList())
            
            nums2.forEach {
                if (nums1ArrayList.contains(it)) {
                    result += it
                    nums1ArrayList.remove(it)
                }
            }
        }
        
        return result
    }
}
