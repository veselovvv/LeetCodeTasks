// https://leetcode.com/problems/self-dividing-numbers/description/

// A self-dividing number is a number that is divisible by every digit it contains.
// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// A self-dividing number is not allowed to contain the digit zero.
// Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val result = mutableListOf<Int>()

        for (number in left..right) {
            val stringNumber = number.toString()

            if (!stringNumber.contains('0')) {
                var isNumberSatisfying = true

                stringNumber.forEach { digit ->
                    if (number % Character.getNumericValue(digit) != 0) 
                        isNumberSatisfying = false
                }

                if (isNumberSatisfying) result.add(number) else isNumberSatisfying = true
            }
        }

        return result
    }
}
