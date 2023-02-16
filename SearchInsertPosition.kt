// https://leetcode.com/problems/search-insert-position/description/
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, 
// return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        nums.forEachIndexed { index, num ->
            if (num == target || num > target) return index
        }

        return nums.size
    }
}
