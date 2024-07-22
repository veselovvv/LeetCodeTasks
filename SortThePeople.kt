// https://leetcode.com/problems/sort-the-people/description/
// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
// For each index i, names[i] and heights[i] denote the name and height of the ith person.
// Return names sorted in descending order by the people's heights.

class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        var indicesOfSortedHeights = arrayOf<Int>()
        var result = arrayOf<String>()

        while (indicesOfSortedHeights.size != names.size) {
            var max = -1
            var indexOfMax = -1

            heights.forEachIndexed { index, height ->
                if (!indicesOfSortedHeights.contains(index) && height > max) {
                    max = height
                    indexOfMax = index
                }
            }

            indicesOfSortedHeights += indexOfMax
        }

        indicesOfSortedHeights.forEach { index ->
            result += names.get(index)
        }

        return result
    }
}
