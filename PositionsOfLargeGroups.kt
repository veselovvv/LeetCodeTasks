// https://leetcode.com/problems/positions-of-large-groups/
// In a string s of lowercase letters, these letters form consecutive groups of the same character.
// For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
// A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group. 
// In the above example, "xxxx" has the interval [3,6].
// A group is considered large if it has 3 or more characters.
// Return the intervals of every large group sorted in increasing order by start index.

class Solution {
    fun largeGroupPositions(s: String): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        var size = 1
        var startIndex = 0
        var endIndex = 0
        
        s.forEachIndexed { index, char ->
            if (index != 0) {
                if (char == s.get(index - 1))
                    size++
                else {
                    endIndex = index - 1
                    
                    if (size >= 3) result.add(listOf(startIndex, endIndex))
                    
                    size = 1
                    endIndex = 0
                    startIndex = index
                }
                
                if (index == s.length - 1) {
                    endIndex = index
                    
                    if (size >= 3) result.add(listOf(startIndex, endIndex))
                }
            }
        }
        
        return result
    }
}
