// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
// You are given a string s consisting of lowercase English letters, and an integer k. First, convert s into an integer by replacing each letter with its position 
// in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. 
// Repeat the transform operation k times in total. Return the resulting integer after performing the operations described above.

class Solution {
    fun getLucky(s: String, k: Int): Int {
        var alphabet = mutableMapOf<Char, Int>()
        var index = 1
        var result = ""
        var count = k
        var sum = 0
        
        for (letter in 'a'..'z') {
            alphabet.put(letter, index)
            index++
        }
        
        s.forEach {
            result += alphabet.get(it)
        }
        
        while (count != 0) {
            result.forEach {
                sum += Character.getNumericValue(it)
            }
            result = sum.toString()
            sum = 0
            count--
        }
        
        return result.toInt()
    }
}
