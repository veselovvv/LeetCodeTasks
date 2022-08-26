// https://leetcode.com/problems/maximum-number-of-balloons/
// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
// You can use each character in text at most once. Return the maximum number of instances that can be formed.

class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        var lettersWithTheirQuantity = mutableMapOf<Char, Int>()
        var result = 0
        
        text.forEach {
            if ("balloon".contains(it)) 
                lettersWithTheirQuantity.put(it, lettersWithTheirQuantity.get(it)?.plus(1) ?: 1)
        }
        
        while (!lettersWithTheirQuantity.values.contains(0)) {
            var enoughLetters = true
            
            "balloon".forEach {
                if ((lettersWithTheirQuantity.get(it) ?: 0) != 0)
                    lettersWithTheirQuantity.put(it, lettersWithTheirQuantity.get(it)?.minus(1) ?: 0)
                else enoughLetters = false
            }
            
            if (enoughLetters) result++ else return result
         }
        
        return result
    }
}
