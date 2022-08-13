// https://leetcode.com/problems/fizz-buzz/
// Given an integer n, return a string array answer (1-indexed) where:
// - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// - answer[i] == "Fizz" if i is divisible by 3.
// - answer[i] == "Buzz" if i is divisible by 5.
// - answer[i] == i (as a string) if none of the above conditions are true.

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        var result = listOf<String>()
        
        for (item in 1..n) {
            result += when {
                item % 3 == 0 && item % 5 == 0 -> "FizzBuzz"
                item % 3 == 0 -> "Fizz"
                item % 5 == 0 -> "Buzz"
                else -> item.toString()
            }
        }
        
        return result
    }
}
