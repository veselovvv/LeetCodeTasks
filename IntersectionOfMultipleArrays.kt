// https://leetcode.com/problems/intersection-of-multiple-arrays/description/
// Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, 
// return the list of integers that are present in each array of nums sorted in ascending order.

class Solution {
    fun intersection(nums: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()
        var shortestArraySize = nums[0].size
        var shortestArrayIndex = 0

        nums.forEachIndexed { index, numsArray ->
            if (numsArray.size < shortestArraySize) shortestArrayIndex = index
        }

        nums[shortestArrayIndex].forEach { num ->
            var everyArrayContainsNum = true

            nums.forEach { numsArray ->
                if (!numsArray.contains(num)) everyArrayContainsNum = false
            }

            if (everyArrayContainsNum) result.add(num)
        }

        return result.sorted()
    }
}
