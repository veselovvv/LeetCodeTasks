// https://leetcode.com/problems/two-out-of-three/
// Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. 
// You may return the values in any order.

class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        
        nums1.forEach { num1 ->
            nums2.forEach { num2 ->
                if (num1 == num2)
                    if (!result.contains(num1)) result.add(num1)
            }
        }
        
        nums1.forEach { num1 ->
            nums3.forEach { num3 ->
                if (num1 == num3)
                    if (!result.contains(num1)) result.add(num1)
            }
        }
        
        nums2.forEach { num2 ->
            nums3.forEach { num3 ->
                if (num2 == num3)
                    if (!result.contains(num2)) result.add(num2)
            }
        }
        
        return result
    }
}
