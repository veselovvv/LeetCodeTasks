// https://leetcode.com/problems/add-digits/description/
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

class Solution {
    fun addDigits(num: Int): Int {
        var newNum = num

        while (newNum.toString().length != 1) {
            var newValue = 0

            newNum.toString().forEach { char ->
                newValue += Character.getNumericValue(char)
            }

            newNum = newValue
        }

        return newNum
    }
}
