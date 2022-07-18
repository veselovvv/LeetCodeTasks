// https://leetcode.com/problems/jewels-and-stones
// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
// Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
// Letters are case sensitive, so "a" is considered a different type of stone from "A".

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var count = 0
        
        jewels.forEach { jewel ->
            stones.forEach { stone -> 
                if (jewel == stone) count++
            }
        }
        
        return count
    }
}
