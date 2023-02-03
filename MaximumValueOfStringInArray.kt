// https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/description/
// The value of an alphanumeric string can be defined as:
// - The numeric representation of the string in base 10, if it comprises of digits only.
// - The length of the string, otherwise.
// Given an array strs of alphanumeric strings, return the maximum value of any string in strs.

class Solution {
    fun maximumValue(strs: Array<String>): Int {
        var maxValue = -1

        strs.forEach { str ->
            val value = if (Regex("[0-9]*").matches(str)) str.toInt()
                else str.length

            if (value > maxValue) maxValue = value 
        }

        return maxValue
    }
}
