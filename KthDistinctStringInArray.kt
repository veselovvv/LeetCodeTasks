// https://leetcode.com/problems/kth-distinct-string-in-an-array/description/
// A distinct string is a string that is present only once in an array.
// Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
// Note that the strings are considered in the order in which they appear in the array.

class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        var count = 1

        arr.forEach { string ->
            if (arr.count { it == string } == 1) {
                if (count == k) return string else count++
            }
        }

        return ""
    }
}
