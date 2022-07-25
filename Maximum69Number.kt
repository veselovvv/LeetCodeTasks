// https://leetcode.com/problems/maximum-69-number/
// You are given a positive integer num consisting only of digits 6 and 9.
// Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

class Solution {
    fun maximum69Number (num: Int): Int {
        var first = true
        var result = ""
        
        num.toString().forEach {
            if (it == '6' && first) {
                result += '9'
                first = false
            } else result += it
        }
        
        return result.toInt()
    }
}
