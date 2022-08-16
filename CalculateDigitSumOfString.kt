// https://leetcode.com/problems/calculate-digit-sum-of-a-string/
// You are given a string s consisting of digits and an integer k.
// A round can be completed if the length of s is greater than k. In one round, do the following:
// 1. Divide s into consecutive groups of size k such that the first k characters are in the first group, the next k characters are in the second group, and so on. 
// Note that the size of the last group can be smaller than k.
// 2. Replace each group of s with a string representing the sum of all its digits. For example, "346" is replaced with "13" because 3 + 4 + 6 = 13.
// 3. Merge consecutive groups together to form a new string. If the length of the string is greater than k, repeat from step 1.
// Return s after all rounds have been completed.

class Solution {
    fun digitSum(s: String, k: Int): String {
        if (s.length <= k) return s
        
        var group = ""
        var groups = arrayOf<String>()
        
        s.forEachIndexed { index, char ->
            if (group.length == k) {
                groups += group
                group = ""
            } 
            
            group += char
            
            if (index == s.length-1) groups += group
        }
        
        var sums = ""
        
        groups.forEach { string ->
            var sum = 0
            
            string.forEach { num ->
                sum += Character.getNumericValue(num)
            }
            
            sums += sum.toString()
        }
        
        return if (sums.length >= 3) digitSum(sums, k) else sums
    }
}
