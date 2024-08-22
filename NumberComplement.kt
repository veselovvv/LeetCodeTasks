// https://leetcode.com/problems/number-complement/description/
// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer num, return its complement.

class Solution {
    fun findComplement(num: Int): Int {
        val binaryNum = Integer.toBinaryString(num)
        var binaryResult = ""

        binaryNum.forEach { item ->
            binaryResult += if (item == '0') "1" else "0"
        }

        return binaryResult.toInt(2)
    }
}
