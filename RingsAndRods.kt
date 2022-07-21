// https://leetcode.com/problems/rings-and-rods/
// There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9. 
// You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair 
// that is used to describe each ring where: 
// - The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
// - The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
// Return the number of rods that have all three colors of rings on them.

class Solution {
    fun countPoints(rings: String): Int {
        val rodsWithRings = LinkedHashMap<Char, String>()
        var ring = '0'
        
        rings.forEach {     
            if (it == 'R' || it == 'G' || it == 'B') ring = it else {
                var newRings = rodsWithRings.get(it) ?: ""
                newRings += ring
                rodsWithRings.put(it, newRings)
            }
        }
        
        var count = 0
        
        rodsWithRings.values.forEach {
            if (it.contains('R') && it.contains('G') && it.contains('B')) count++ 
        }
        
        return count
    }
}
